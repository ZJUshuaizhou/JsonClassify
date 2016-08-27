package zju.edu.cn.apm.jsonclassify;


import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class TakeStructure {
	public static String  takeStructure(String jsonString) {
		JSONObject test=null;
		StringBuffer result=new StringBuffer();
		try {
			test= JSON.parseObject(jsonString);			
			for (Entry<String,Object> entry : test.entrySet()) {
				result.append(entry.getKey());
				result.append("{");
				result.append(takeStructure(entry.getValue().toString()));
				result.append("}");	
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result.toString();
	}
	public static void main(String[] args) {
		String test="{\"node_0\":{\"apm_time\":\"2016-08-22 13:36:46\",\"apm_url\":\"/xinyunlian-ecom/home/index/getVisiblePromotionInIndex.jhtml\",\"apm_create\":\"2016-08-22 15:43:56\",\"apm_span\":\"945803244421875641\",\"apm_agent\":\"172.16.3.78@172.16.3.78:8080\",\"http\":{\"cookie\":{\"CHANGEPASSWORD\":\"1\",\"CNZZDATA1253608828\":\"1338340187-1467940395-|1471263664\",\"REMACT\":\"330483100002\",\"_nphlAna\":\"uid#9613831\",\"mobile\":\"13999999999\",\"JSESSIONID\":\"DCC712030A74B9CB9F7832F1B5B0635B.tomcatEcom1\",\"isDealer\":\"true\",\"token\":\"68bac264-02a1-46ec-b5d6-21b19c944780\",\"CANRECEIVE\":\"true\",\"fullArea\":\"浙江省嘉兴市桐乡市\",\"qqnumber\":\"4008019906\",\"LOCAL\":\"green\",\"feusername\":\"张苏浙\",\"hotLine\":\"400-801-9906\",\"memberrank\":\"1\",\"username\":\"330483100002\"},\"param\":{\"ids\":\"6883,6882,6891,6942\",\"_\":\"1471844205048\"},\"header\":{\"x-real-ip\":\"172.16.3.10\",\"x-forwarded-server\":\"xyl-qa.hengtiansoft.com\",\"x-forwarded-host\":\"xyl-qa.hengtiansoft.com\",\"x-forwarded-for\":\"183.131.243.178, 172.16.3.10\"},\"url\":\"/xinyunlian-ecom/home/index/getVisiblePromotionInIndex.jhtml\"},\"apm_pspan\":\"-1\",\"db\":{\"xinyunlian_system_settings_select\":{\"result\":[{\"xinyunlian_system_settings#value\":\"true\"}],\"executeTime\":\"2016-08-22 13:36:46\",\"sql\":\"select value from xinyunlian_system_settings where property= registerOpened\"},\"temp_select\":{\"result\":[{\"#dealer\":347},{\"#dealer\":351},{\"#dealer\":2000881},{\"#dealer\":291},{\"#dealer\":2000357},{\"#dealer\":2000373},{\"#dealer\":2000883},{\"#dealer\":2000892},{\"#dealer\":2000895},{\"#dealer\":2000896},{\"#dealer\":2000898},{\"#dealer\":2000888},{\"#dealer\":2000899},{\"#dealer\":2000447},{\"#dealer\":2000449},{\"#dealer\":2000451},{\"#dealer\":2000457},{\"#dealer\":2000461},{\"#dealer\":2000547},{\"#dealer\":2000890},{\"#dealer\":307},{\"#dealer\":265},{\"#dealer\":25},{\"#dealer\":35},{\"#dealer\":161},{\"#dealer\":163},{\"#dealer\":167},{\"#dealer\":171},{\"#dealer\":181},{\"#dealer\":183},{\"#dealer\":185},{\"#dealer\":187},{\"#dealer\":213},{\"#dealer\":2000543},{\"#dealer\":61},{\"#dealer\":325},{\"#dealer\":2000882},{\"#dealer\":27},{\"#dealer\":45},{\"#dealer\":55},{\"#dealer\":295},{\"#dealer\":2000069},{\"#dealer\":2000137},{\"#dealer\":2000627},{\"#dealer\":245},{\"#dealer\":327},{\"#dealer\":2000375},{\"#dealer\":2000253},{\"#dealer\":337},{\"#dealer\":2000017},{\"#dealer\":53},{\"#dealer\":59},{\"#dealer\":241},{\"#dealer\":57},{\"#dealer\":237},{\"#dealer\":383},{\"#dealer\":395},{\"#dealer\":2000013},{\"#dealer\":2000015},{\"#dealer\":15},{\"#dealer\":239},{\"#dealer\":379},{\"#dealer\":381},{\"#dealer\":2000071},{\"#dealer\":2000287},{\"#dealer\":17},{\"#dealer\":477},{\"#dealer\":2000523},{\"#dealer\":417},{\"#dealer\":2000549},{\"#dealer\":2000271},{\"#dealer\":2000273},{\"#dealer\":2000463},{\"#dealer\":2000465},{\"#dealer\":2000113},{\"#dealer\":2000479},{\"#dealer\":43},{\"#dealer\":83},{\"#dealer\":85},{\"#dealer\":87},{\"#dealer\":89},{\"#dealer\":2000467},{\"#dealer\":2000469},{\"#dealer\":2000471},{\"#dealer\":2000473},{\"#dealer\":2000475},{\"#dealer\":2000477},{\"#dealer\":2000115},{\"#dealer\":2000483},{\"#dealer\":2000529},{\"#dealer\":2000365},{\"#dealer\":71},{\"#dealer\":145},{\"#dealer\":235},{\"#dealer\":251},{\"#dealer\":419},{\"#dealer\":421},{\"#dealer\":429},{\"#dealer\":437},{\"#dealer\":457}],\"executeTime\":\"2016-08-22 13:36:46\",\"sql\":\"select dealer from (select sd.dealer from xinyunlian_street_dealer sd inner join xinyunlian_member m on sd.street = m.street where m.id = 267139 union select dealer from xinyunlian_dealer_visible_member where member = 267139 union select id from xinyunlian_dealer where id not in (select dealer from xinyunlian_street_dealer) and id not in (select dealer from xinyunlian_dealer_visible_member) ) temp where temp.dealer not in (select dealer from xinyunlian_dealer_invisible_member where member = 267139)\"},\"xinyunlian_promotion_select\":{\"result\":[{\"xinyunlian_promotion#id\":6882},{\"xinyunlian_promotion#id\":6883},{\"xinyunlian_promotion#id\":6891},{\"xinyunlian_promotion#id\":6942}],\"executeTime\":\"2016-08-22 13:36:46\",\"sql\":\" select pro.id from xinyunlian_promotion pro  where pro.id in (6883, 6882, 6891, 6942)  and (pro.dealer in (347, 351, 2000881, 291, 2000357, 2000373, 2000883, 2000892, 2000895, 2000896, 2000898, 2000888, 2000899, 2000447, 2000449, 2000451, 2000457, 2000461, 2000547, 2000890, 307, 265, 25, 35, 161, 163, 167, 171, 181, 183, 185, 187, 213, 2000543, 61, 325, 2000882, 27, 45, 55, 295, 2000069, 2000137, 2000627, 245, 327, 2000375, 2000253, 337, 2000017, 53, 59, 241, 57, 237, 383, 395, 2000013, 2000015, 15, 239, 379, 381, 2000071, 2000287, 17, 477, 2000523, 417, 2000549, 2000271, 2000273, 2000463, 2000465, 2000113, 2000479, 43, 83, 85, 87, 89, 2000467, 2000469, 2000471, 2000473, 2000475, 2000477, 2000115, 2000483, 2000529, 2000365, 71, 145, 235, 251, 419, 421, 429, 437, 457, 459, 461, 2000519, 23, 147, 151, 157, 159, 423, 439, 441, 2000171, 49, 75, 99, 123, 137, 285, 431, 451, 453, 455, 463, 467, 2000481, 2000885, 2000886, 2000887, 261, 425, 443, 447, 233, 357, 469, 253, 499, 367, 471, 473, 2000641, 2000291, 2000691, 2000289, 2000431, 2000297, 2000413, 2000415, 2000417, 2000513, 2000515, 2000293, 2000407, 2000409, 2000411, 2000313, 2000427, 2000429, 2000295, 2000315, 2000419, 2000421, 2000423, 2000425, 2000187, 2000231, 2000233, 2000235, 2000239, 2000241, 2000243, 2000333, 2000661, 2000189, 2000335, 2000237, 2000247, 2000249, 2000251, 2000563, 2000717, 2000191, 2000229, 2000245, 2000195, 2000511, 2000193, 2000401, 2000199, 2000405, 2000197, 2000505, 2000507, 2000509, 2000079, 2000303, 2000339, 2000077, 2000309, 2000341, 2000493, 2000141, 2000345, 2000487, 2000489, 2000491, 2000767, 2000377, 2000381, 2000801, 2000803, 2000391, 2000541, 2000793, 2000795, 2000343, 2000485, 2000503, 2000389, 2000395, 2000539, 2000797, 2000799, 2000321, 2000435, 2000441, 2000443, 2000445, 2000433, 2000437, 2000439, 2000383, 2000319, 2000393, 2000865, 2000317, 2000711, 2000713, 2000715, 2000721, 19, 91, 133, 135, 227, 229, 299, 497, 2000021, 2000023, 2000025, 2000027, 2000029, 2000031, 2000033, 2000035, 2000037, 2000039, 2000041, 2000045, 2000049, 2000051, 2000053, 2000057, 2000061, 2000073, 2000561, 2000880, 2000894, 41, 139, 2000497, 37, 73, 81, 119, 121, 125, 127, 309, 2000403, 2000575, 2000625, 31, 79, 195, 197, 199, 201, 287, 303, 305, 329, 1, 2, 47, 103, 105, 107, 109, 247, 2000007, 263, 281, 2000347, 2000581, 2000697, 2000897, 65, 93, 95, 97, 101, 489, 2000201, 2000217, 2000219, 2000223, 2000225, 2000275, 2000277, 2000279, 2000337, 2000565, 2000585, 503, 2000583, 2000089, 2000323, 2000087, 485, 2000607, 2000637, 2000589, 2000617, 205, 289, 21, 165, 169, 175, 177, 111, 113, 115, 117, 209, 211, 315, 2000719, 143, 149, 155, 173, 179, 2000579, 301, 2000875, 2000595, 355, 2000179, 2000867, 2000131, 2000517, 2000133, 2000531, 2000573, 2000109, 2000111, 2000757, 2000879, 63, 207, 243, 3, 13, 39, 77, 311, 317, 2000081, 385, 339, 361, 387, 391, 343, 2000005, 2000091, 2000299, 257, 269, 349, 2000495, 203, 2000557, 67, 189, 191, 193, 275, 2000789, 2000553, 2000659, 2000679, 2000829, 2000843, 2000763, 2000663, 2000681, 2000725, 2000877, 2000755, 2000669, 2000873, 2000851, 2000777, 2000753, 2000709, 2000845, 2000849, 2000841, 2000863, 1001015, 2000825, 2000891, 2000893, 2000701, 2000781, 2000815, 2000783, 2000791, 2000811, 2000813, 2000827, 2000807, 2000695, 2000773, 2000779, 2000657, 2000675, 2000687, 2000831, 2000835, 2000837, 2000839, 2000551, 2000759, 2000771, 2000775, 2000787, 2000833, 2000871, 2000655, 2000769, 2000817, 2000821, 2000671, 2000689, 2000853, 2000673, 2000823, 2000605, 2000611, 2000615, 2000601, 2000603, 2000609, 2000621, 2000693, 2000599, 2000643, 2000653, 2000723, 2000859, 2000619, 2000645, 2000647, 2000733, 2000739, 2000861, 2000735, 2000727, 2000705, 2000737, 2000745, 2000747, 2000809, 2000857, 2000649, 2000683, 2000749, 2000751, 2000651, 2000819, 2000855, 2000741, 2000743, 2000761, 2000729, 2000703, 51, 69, 141, 153, 427, 435, 449, 465, 2000525, 2000527, 29, 129, 393, 433, 2000163, 2000173, 2000399, 2000847, 2000731, 2000677, 2000685) or pro.dealer = 1)  and not exists (select 1 from xinyunlian_promotion_product pp where pp.promotions = pro.id and pp.products in (-1))\"},\"xinyunlian_product_invisible_member_select\":{\"result\":[],\"executeTime\":\"2016-08-22 13:36:46\",\"sql\":\"select product from xinyunlian_product_invisible_member where member = 267139\"}}}}";
		String failed="330483100002";
		long startTime=System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			takeStructure(test);
		}
		//System.out.println(takeStructure(test));
		long endtime=System.currentTimeMillis();
		System.out.println("time is :"+(endtime-startTime)+"ms");
	}
}
