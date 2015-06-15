package zhiyou.Dao;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.components.File;
import org.aspectj.util.FileUtil;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.io.IOException;
import java.util.List;

/**
 * Created by zhiyou on 15-6-11.
 * soure 源文件的绝对路径
 * dis 目标文件的路径
 * feilType允许上传的文件类型列表
 */
public class Disposeupload extends HibernateDaoSupport {
    public String uploadFeil(String source,String dis,List<String> fileType){
        String filename="";
        try{
           // filename=source;//todo 改为直接获取文件的名字，不用在去前面的路径
            filename=source.substring(source.lastIndexOf("\\")+1);//去掉源文件的路径，只取文件名
            String fileext=filename.substring(filename.lastIndexOf(".")+1);//文件的后缀名
          //  if(fileType.contains(fileext.toLowerCase())){//输入文件的类型符号规定
                java.io.File disfile=new java.io.File(dis);
                if(!disfile.exists()){//若不存在目标文件，则创建
                    disfile.getParentFile().mkdirs();
                    disfile.createNewFile();
                }
                else {//若不存在则删除后重建
                    disfile.delete();
                    disfile.createNewFile();
                }
                java.io.File srcFile = new java.io.File(source);
                FileUtils.copyFile(srcFile,disfile);
          //  }
//            else {
//                return null;
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return filename;
    }
}
