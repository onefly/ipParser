package com.ip.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.common.util.ip.IPSeeker;

public class IPtest implements Runnable {
	private static Logger log = LoggerFactory.getLogger(IPSeeker.class);
	private   IPSeeker ip = new IPSeeker("QQWry.Dat",
			"C:/Program Files/cz88.net/ip");
	private int i;

	public IPtest(int i) {
		this.i = i;
	}

	public   void testIp() {
		// 指定纯真数据库的文件名，所在文件夹
		/* IPSeeker ip = new IPSeeker("QQWry.Dat",
		 "C:/Program Files/cz88.net/ip");*/
		// 测试IP 58.20.43.13
		String ipAddr = "223.72.72.202";
		/*System.out.println(Thread.currentThread().getName() + "---"
				+ ip.getIPLocation(ipAddr).getCountry() + ":"
				+ ip.getIPLocation(ipAddr).getArea());*/
		log.debug(ip.getIPLocation(ipAddr).getCountry() + ":"
				+ ip.getIPLocation(ipAddr).getArea());
	}

	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			new Thread(new IPtest(i)).start();
		}
	}

	public void run() {
		
		/*try {
			Thread.sleep(100*i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		 
		testIp();
	}
}
