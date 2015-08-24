package zhiyou.model;

/**
 * Created by zhiyou on 15-7-25.
 */
public class Filelist {
    private Integer id;
  private String filename;
//    private String filetype;

    public Filelist() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

//    public String getFiletype() {
//        return filetype;
//    }
//
//    public void setFiletype(String filetype) {
//        this.filetype = filetype;
//    }

    public  Filelist(String filename){
        this.filename=filename;
//        this.filetype=filetype;
    }
}
