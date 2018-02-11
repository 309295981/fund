package com.shenqi.mybatis.manual;




import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;


public class BuilderJavaClassFile {

	private String targetProject; 
	private String daltargetProject; 
	private String targetServer; 
	private String targetImpl; 
	private String targetJunit; 
	private String projectPath ;
	private String targetBean;
	private String projectPackage;
	private String targetMapper;
	private String targetServiceImpl;
	private String targetXmlMapper;
	public HashMap<String,String> _fileds;
	
	public BuilderJavaClassFile(String configPath) {
		
		targetProject = readPropertie(configPath, "targetProject");
		daltargetProject = readPropertie(configPath, "daltargetProject");
		targetBean = readPropertie(configPath, "modelPackage");
		targetMapper = readPropertie(configPath, "daoMapperPackage");
		targetXmlMapper = readPropertie(configPath, "sqlMapperPackage");

		targetServiceImpl =readPropertie(configPath, "serviceImplMapperPackage");
		
		targetServer = readPropertie(configPath, "serverMapperPackage");
		targetImpl = readPropertie(configPath, "serviceImplMapperPackage");
		targetJunit = readPropertie(configPath, "junitTestProject");
		//targetJunit = readPropertie(configPath, "junitTestProject");
		projectPackage = readPropertie(configPath, "projectPackage");
		projectPath = BuilderJavaClassFile.class.getResource("/")
				.toString().replace("/target/classes","/mybatis");
		projectPath = projectPath.substring(5);
		daltargetProject = projectPath.replace("util/mybatis/","")+ daltargetProject;
		targetProject = projectPath.replace("util/mybatis/","") + targetProject;
		targetJunit = projectPath.replace("util/mybatis/","")  + targetJunit;
		
	}
	
	public void delete(FileType t,String fileName) throws IOException {
		
		String templatePath = this.getTemplatePath(t);
		StringBuffer sb = this.readFile(projectPath, templatePath);
		String target="";
		if(t == FileType.BEAN)
		{
			target = daltargetProject+ targetBean.replace('.', '/')  +"/"+  this.getFileName(t,fileName) ;
		}
		if(t == FileType.BEANSEARCH)
		{
			target = daltargetProject+ targetBean.replace('.', '/')  +"/"+  this.getFileName(t,fileName) ;
		}
		else if(t == FileType.MAPPER)
		{
			target = daltargetProject +targetMapper.replace('.', '/')  +"/"+ this.getFileName(t,fileName) ;
		}
		else if(t == FileType.XML)
		{
			target = daltargetProject+targetXmlMapper.replace('.', '/')+ "/"+ this.getFileName(t,fileName) ;
		}
		else if(t == FileType.JUNITTEST)
		{
			target = targetJunit+ projectPackage.replace('.', '/')  +"/"+  this.getFileName(t,fileName) ;
		}
		else if(t == FileType.IMPL)
		{
			target = targetProject +targetImpl.replace('.', '/')  +"/"+ this.getFileName(t,fileName) ;
			
			this.assignSearchFields();
		}
		else if(t == FileType.SERVICE)
		{
			target = targetProject+targetServer.replace('.', '/')+ "/"+ this.getFileName(t,fileName) ;
		}
		

		File f =new File(target);
		if(f.exists()) 
		{
			f.delete();
			System.out.print("\n  delete file succeed :" + target + "");
		}
		else
		{
			System.out.print("\n  file not exists :" + target + "");
		}
			
		
	}
	
	
	public void save( FileType t,String fileName) throws IOException {
		
		String templatePath = this.getTemplatePath(t);
		StringBuffer sb = this.readFile(projectPath, templatePath);
		String target="";
		if(t == FileType.JUNITTEST)
		{
			target = targetJunit+ projectPackage.replace('.', '/')  +"/"+  this.getFileName(t,fileName) ;
			return;
		}
		else if(t == FileType.IMPL)
		{
			target = targetProject +targetImpl.replace('.', '/')  +"/"+ this.getFileName(t,fileName) ;
			
			this.assignSearchFields();
		}
		else if(t == FileType.SERVICE)
		{
			target = targetProject+targetServer.replace('.', '/')+ "/"+ this.getFileName(t,fileName) ;
		}
		
		String javaCode = this.assignTemplate(sb, t,fileName);
		

		saveFile(javaCode,target);
		/*
		System.out.print(targetJunit+"\n");
		*/
	}
	private String assignTemplate(StringBuffer sb,FileType t,String fileName)
	{
		String temp = sb.toString();
		temp = temp.replace("{package}", projectPackage);
		temp = temp.replace("{package_server}", targetServer);
		temp = temp.replace("{package_bean}", targetBean);
		temp = temp.replace("{package_mapper}", targetMapper);
		temp = temp.replace("{package_impl}", targetServiceImpl);
		temp = temp.replace("{bean_class_name}", this.getClassName("bean_class_name", fileName));
		temp = temp.replace("{bean_name}", this.getClassName("bean_name", fileName));
		
		if(t == FileType.IMPL)
		{
			temp = temp.replace("{criteria_code}", this.assignSearchFields());
			temp = temp.replace("{cache_keys}", this.assignKeysFields());
			temp = temp.replace("{bean_timestamp_add_time}", this.assignTimestampFilelds(new String[]{"addtime","add_time"}));
			temp = temp.replace("{bean_timestamp_update_time}", this.assignTimestampFilelds(new String[]{"updatetime","update_time"}));

		}
		return temp;
	}
	
	private String assignSearchFields()
	{
		StringBuffer sb = new  StringBuffer();
		if(this._fileds!=null)
		{
			sb.append("		if(bean!=null)\n");
			sb.append("		{\n");
			Iterator<Entry<String, String>> it = this._fileds.entrySet().iterator(); 
			while (it.hasNext()) { 
			Entry<String,String> entry = (Entry<String,String>) it.next();
			Object key = entry.getKey(); 
			Object value = entry.getValue(); 
			sb.append(this.assignFilesAndType(key.toString(),value.toString()));
			}
			sb.append("		}\n");
		}
		return sb.toString();
	}
	
	private String assignTimestampFilelds(String[] fields)
	{
		StringBuffer sb = new  StringBuffer();
		Map<String,String> fs = new HashMap<String,String>();
		if(this._fileds!=null)
		{
			Iterator<Entry<String, String>> it = this._fileds.entrySet().iterator(); 
			while (it.hasNext()) { 
			Entry<String,String> entry = (Entry<String,String>) it.next();
			Object key = entry.getKey(); 
			Object value = entry.getValue(); 
			String skey = key.toString();
			String svalue = value.toString();
			for(String s : fields)
			{
				if(s.equals(skey))
				{
					if(svalue.equals("datetime"))
					{
						sb.append("bean.set" + this.getAttributeName(skey) + "(new Date());\n");
					}
					else if(svalue.equals("int"))
					{
						sb.append("bean.set" + this.getAttributeName(skey) + "(TTime.getTime());\n");
					}
				}
			}
			}
		}
		return sb.toString();
	}
	
	
	private String assignKeysFields()
	{
		StringBuffer sb = new  StringBuffer();
		if(this._fileds!=null)
		{
			Iterator<Entry<String, String>> it = this._fileds.entrySet().iterator(); 
			while (it.hasNext()) { 
			Entry<String,String> entry = (Entry<String,String>) it.next();
			Object key = entry.getKey(); 
			Object value = entry.getValue(); 
			if(sb.length()>0)
				sb.append(",\n				");
			sb.append(this.assignKeyFilesAndType(key.toString(),value.toString()));
			}
		}
		if(sb.length()>0)
			sb.append(",");
		
		sb.append("\n				Convert.toString(bean.getLimitStart()),Convert.toString(bean.getLimitEnd())");
		return sb.toString();
	}
	
	
	private String assignFilesAndType(String name,String type)
	{

		StringBuffer sb = new  StringBuffer();
		name = this.getAttributeName(name);
		
		if(name!=null && name.length() >0)
		{
			sb.append("		if(bean.get"+name+"()!=null");
			if(type.equals("int") || type.equals("bigint") || type.equals("tinyint")|| type.equals("double") || type.equals("smallint") || type.equals("float"))
			{
				sb.append(" && bean.get" + name + "()!=-1)\n");
			}
			else if(type.equals("char") || type.equals("varchar"))
			{
				sb.append(" && bean.get" + name + "().length()>0)");
			}
			else if(type.equals("bit") || type.equals("datetime"))
			{
				sb.append(" )");
			}
			else
			{
				return "";
			}
			sb.append("		{\n");
			sb.append("				cra.and"+ name +"EqualTo(bean.get"+name+"());\n");
			sb.append("		}\n");
		}
		return sb.toString();
	}
	
	private String assignKeyFilesAndType(String name,String type)
	{
		StringBuffer sb = new  StringBuffer();
		name = this.getAttributeName(name);
		if(name!=null && name.length() >0)
		{
			sb.append("	Convert.toString(bean.get"+ name +"(),\"\")");
		}
		return sb.toString();
	}
	
	
	
	private static String getAttributeName(String name)
	{
		int index=name.indexOf('_');
		if(index==0)
		{
			name = name.substring(1);	
		}
		else if(index== name.length()-1)
		{
			name= name.substring(0,name.length()-1);
		}
		else if(index != -1)
		{
			name = name.substring(0,index)  + name.substring(index +1,index +2).toUpperCase() + name.substring(index+2); 
		}
		name = name.substring(0,1).toUpperCase() + name.substring(1);
		
		index=name.indexOf('_');
		if(index>0)
		{
			name = getAttributeName(name);
		}
		return name;
	}
	
	private void saveFile(String sb,String fileName) throws IOException
	{
		File f =new File(fileName);
		if(f.exists())
		{
			String relPath = f.getCanonicalPath();
			System.out.println("File exists \t" +relPath);
			
			fileName = relPath +".1";
			System.out.println("\tSaveas \t" + fileName);
		}
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(fileName, true),"UTF-8");
		osw.write(sb.toString());
		osw.flush();
		osw.close();
	}
	
	private String getTemplatePath(FileType t)
	{
		if(t==FileType.JUNITTEST)
		{
			return "/com/shenqi/mybatis/manual/template/JUnitTemplate.template";
		}
		else if (t== FileType.IMPL)
		{
			return "/com/shenqi/mybatis/manual/template/ServiceImplTemplate.template";
		}
		return "/com/shenqi/mybatis/manual/template/ServiceTemplate.template";
	}
	private String getFileName(FileType t,String fileName)
	{
		fileName =this.getAttributeName(fileName);
		
		if(t==FileType.JUNITTEST)
		{
			return fileName + "ManagerTest.java";
		}
		else if(t==FileType.SERVICE)
		{
			return fileName + "Manager.java";
		}
		else if(t == FileType.IMPL)
		{
			return fileName + "ManagerImpl.java";	
		}
		else if(t == FileType.BEAN)
		{
			return fileName + ".java";
		}
		else if(t == FileType.BEANSEARCH)
		{
			return fileName +"Search.java";
		}
		else if(t == FileType.XML)
		{
			return fileName +"Mapper.xml";
		}
		else if(t == FileType.MAPPER)
		{
			return fileName +"Mapper.java";
		}
		return "";
	}
	
	private String getClassName(String t,String fileName)
	{
		fileName = this.getAttributeName(fileName);
		if(t=="bean_class_name")
		{
			return fileName;
		}
		if(t=="bean_name")
		{
			return fileName.substring(0,1).toLowerCase() + fileName.substring(1);
		}
		return fileName ;
	}
	

	private StringBuffer readFile(String projectPath, String templatePath)
			throws IOException {
		
		StringBuffer sb = new StringBuffer();
		FileReader fr = new FileReader(projectPath + templatePath);
		int ch = 0;
		try {
			while ((ch = fr.read()) != -1) {
				sb.append((char) ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fr.close();
		}

		return sb;
	}
	
	public String readPropertie(String filePath, String key) {

		filePath = BuilderServiceAndImpl.class.getResource("/" + filePath)
				.toString().replace("/target/classes","/mybatis");
	
		filePath = filePath.substring(5);
		Properties props = new Properties();
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(
					filePath));
			props.load(in);
			in.close();
			String value = props.getProperty(key);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String getTargetProject() {
		return targetProject;
	}

	public void setTargetProject(String targetProject) {
		this.targetProject = targetProject;
	}

	public String getTargetServer() {
		return targetServer;
	}

	public void setTargetServer(String targetServer) {
		this.targetServer = targetServer;
	}

	public String getTargetImpl() {
		return targetImpl;
	}

	public void setTargetImpl(String targetImpl) {
		this.targetImpl = targetImpl;
	}

	public String getTargetJunit() {
		return targetJunit;
	}

	public void setTargetJunit(String targetJunit) {
		this.targetJunit = targetJunit;
	}

	public String getProjectPath() {
		return projectPath;
	}

	public void setProjectPath(String projectPath) {
		this.projectPath = projectPath;
	}

	public String getTargetBean() {
		return targetBean;
	}

	public void setTargetBean(String targetBean) {
		this.targetBean = targetBean;
	}

	public String getProjectPackage() {
		return projectPackage;
	}

	public void setProjectPackage(String projectPackage) {
		this.projectPackage = projectPackage;
	}

	public String getTargetMapper() {
		return targetMapper;
	}

	public void setTargetMapper(String targetMapper) {
		this.targetMapper = targetMapper;
	}

	public String getTargetServiceImpl() {
		return targetServiceImpl;
	}

	public void setTargetServiceImpl(String targetServiceImpl) {
		this.targetServiceImpl = targetServiceImpl;
	}

	public String getTargetXmlMapper() {
		return targetXmlMapper;
	}

	public void setTargetXmlMapper(String targetXmlMapper) {
		this.targetXmlMapper = targetXmlMapper;
	}

	public HashMap<String, String> get_fileds() {
		return _fileds;
	}

	public void set_fileds(HashMap<String, String> _fileds) {
		this._fileds = _fileds;
	}

	public String getDaltargetProject() {
		return daltargetProject;
	}

	public void setDaltargetProject(String daltargetProject) {
		this.daltargetProject = daltargetProject;
	}
}

