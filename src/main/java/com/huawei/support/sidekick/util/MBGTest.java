/**  
 * Project Name:sidekick_crud  
 * File Name:MBGTest.java  
 * Package Name:com.huawei.support.sidekick.util  
 * Date:2018年6月17日上午12:17:30  
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.huawei.support.sidekick.util;  
/**
 * 
 * ClassName: MBGTest <br/>  
 * Function: 逆向工程代码生成类 <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2018年6月17日 上午12:18:57 <br/>  
 *  
 * @author sidekick  
 * @version   
 * @since JDK 1.8
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MBGTest {
	public static void main(String[] args) throws Exception {
		
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("mbg.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}
}
  
