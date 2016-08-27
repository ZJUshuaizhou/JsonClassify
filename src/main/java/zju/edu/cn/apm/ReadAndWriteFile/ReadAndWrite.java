package zju.edu.cn.apm.ReadAndWriteFile;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

public class ReadAndWrite {
    public static void readFileByLines(String fileName,ReadProcess readProcess) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line=reader.readLine())!=null ) {
               readProcess.processRead(line);
            	//System.out.println(line);
            }
        }catch (IOException e) {

        }finally {
            if(reader!=null) {
                try{
                    reader.close();
                }catch (IOException e) {
                    ;
                }
            }
        }
    }	
    
    public static void useBufferedFileOutputStream(String fileName,String content) {
        File file = new File(fileName);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            bufferedOutputStream.write(content.getBytes());
            bufferedOutputStream.flush();
        }catch(IOException e) {
        	e.printStackTrace();
        }finally {
            if(bufferedOutputStream!=null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e1) {
                    //TODO  do something
                }
            }
        }
    }

    
    /**
     * 需要配置纠正位，即第几位是开始位，例如"/web/student/v2/doassignment/queryassignment/1119342"
     * 分割后的第0位为空，第1位是web，第二位是student，需要去除纠正位
     * @param args
     */
    public static void main(String[] args) {
//    	long starttime=System.currentTimeMillis();
//    	ReadProcess countProcess=new CountProcess();
//    	Node root = new Node("root", null);
//    	ReadProcess nfaProcess=new NFAProcess(root);
//		readFileByLines("G:\\APM\\URL正则\\URLData\\test005.txt",nfaProcess);
//		nfaProcess.sysoInfo();
//		//countProcess.sysoInfo();
//		//ArrayList<Map<String, Integer>> helloWorld1 =countProcess.countingStars();
//		CheckOutProcess checkOutProcess=new CheckOutProcess(root);
//		checkOutProcess.matchingURL("/web/student/v2/doassignment/load/firstquestion/3351194");
//		checkOutProcess.matchingURL("/002/student/examV2/next/question/382382");
//		checkOutProcess.matchingURL("/002/student/v2/doassignment/load/firstquestion/1880678");
//		checkOutProcess.matchingURL("/web/teacher/getDisplayTypesWithSmart");
//		checkOutProcess.matchingURL("/web/teacher/newAssignment/");
//		checkOutProcess.matchingURL("/001/student/doassignment/save/question");
//		checkOutProcess.matchingURL("/001/student/examV2/next/question/379556");
//		checkOutProcess.matchingURL("/web/remote/com.hengtiansoft.k12.common.security.service.UserService/userLogout");
//		checkOutProcess.matchingURL("/assets/vendor/echarts-2.2.7/src/component/valueAxis.js");
//		checkOutProcess.matchingURL("/web/auth/login;JSESSIONID=05738d91-1727-4b1c-a8d7-305e6574d988");
//		checkOutProcess.matchingURL("/web/teacher/message/messagescount");
//		checkOutProcess.matchingURL("/assets/img/login/icon_last.png");
//		checkOutProcess.matchingURL("/assets/img/assignhomeworkbg.png");
//		
//		checkOutProcess.matchingURL("/wssb-app-ww-web/web/syjkbx/syjkbxqq/%22%3E%3Cscript%3Ealert(5542)%3C/script%3E");
//		checkOutProcess.matchingURL("/wssb-app-ww-web/web/sbgy/WFDir20814/");
//		checkOutProcess.matchingURL("/wssb-app-ww-web/web/qynsrxx/phpmyadmin/NonExistentFile.php3");
//		checkOutProcess.matchingURL("/javax.faces.resource/images/ui-icons_2694e8_256x240.png.xhtml");
//		///assets/img/APP/zmexe.png
//		long endtime=System.currentTimeMillis();
//		System.out.println("Time is : "+(endtime-starttime)+"ms");
		
	}
}
