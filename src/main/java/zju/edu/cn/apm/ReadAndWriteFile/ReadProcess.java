package zju.edu.cn.apm.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Map;

public interface ReadProcess {
	public String processRead(String line);
	public void sysoInfo();
	public ArrayList<Map<String, Integer>> countingStars();
}
