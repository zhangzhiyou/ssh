package zhiyou.dispose_download;

import java.io.File;

/**
 * Created by zhiyou on 15-8-14.
 */
public class DeletDao {
    public void delete(File file){

        if(file.exists()){
            if(file.isFile()){
                file.delete();
            }
            else if(file.isDirectory()){
                File[] files = file.listFiles();//声明目录下所有的文件 files[];
                for (int i = 0;i < files.length;i ++) {//遍历目录下所有的文件

                    this.delete(file);//把每个文件用这个方法进行迭代
                }
                file.delete();//删除文件夹
            }
        } else {
            System.out.println("所删除的文件不存在");
        }
    }

}
