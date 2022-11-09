package gis.JavaAssist.conversion;

/**
 * @author Zachary Nichelson
 * Created on 11/8/2022
 */
public class datatransfer {

    /**
     *
     * @param byt
     * @return
     */
    public int b_to_b(int byt){
        return byt * 8;
    }

    /**
     *
     * @param kb
     * @return
     */
    public int kb_to_b(int kb){
        return kb * 1024;
    }

    /**
     *
     * @param mb
     * @return
     */
    public int mb_to_kb(int mb){
        return mb * 1024;
    }

    /**
     *
     * @param gb
     * @return
     */
    public int gb_to_mb(int gb){
        return gb * 1024;
    }

    /**
     *
     * @param tb
     * @return
     */
    public int tb_to_gb(int tb){
        return tb * 1024;
    }

    /**
     *
     * @param minutes
     * @param dataSize dataSize in MBs
     * @return returns (minutes / 60) / datasize
     */
    public int download_speed(int minutes, int dataSize){
        return (minutes / 60) / dataSize;
    }
}
