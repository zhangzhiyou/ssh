package zhiyou.Dao;

import zhiyou.model.Filelist;

/**
 * Created by zhiyou on 15-7-25.
 */
public interface Dfilelist {
    public void save(Filelist filelist);
    public void updata(Filelist filelist);
    public String showtable() throws Exception;
    public void delect(String filename);
}
