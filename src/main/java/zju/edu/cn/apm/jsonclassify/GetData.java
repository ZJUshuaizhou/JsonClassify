package zju.edu.cn.apm.jsonclassify;

import java.util.ArrayList;
import java.util.List;

import org.vlis.apm.esclient.operator.customize.EventProducerSearch;

import zju.edu.cn.apm.ReadAndWriteFile.ReadAndWrite;

public class GetData {
	public static void main(String[] args) {
		String writeFilePath="F:\\apm.txt";
		//new ArrayList<Object>();
		List<Object> result =	EventProducerSearch.getAllRecordsByRootUrl("/xinyunlian-ecom/home/index/getVisiblePromotionInIndex.jhtml");
		///xinyunlian-ecom/home/index/getVisiblePromotionInIndex.jhtml
		///xinyunlian-ecom/signPoint/check.jhtml
		///xinyunlian-ecom/home/index/getVisiblePromotionInIndex.jhtml
//		StringBuffer writeString =new StringBuffer();
		for (Object object : result) {
//			writeString.append(object.toString()+"\r\n");
			
			System.out.println("write into file"+object.toString()+"\r\n");
		}
//		ReadAndWrite.useBufferedFileOutputStream(writeFilePath, writeString.toString());
	}
}
