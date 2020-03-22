package jedistest.demo.JedisTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class JsonTest {
    public static void main(String[] args) {
        String stu1 = JSON.toJSONString(new Stu("ybx", 23));
        System.out.println("javaBean对象转换为Json对象" + stu1);
        Stu stu = JSON.parseObject(stu1,Stu.class);
        System.out.println("Json对象转换为JavaBean对象" + stu);
        System.out.println("Json对象" + JSON.toJSON(new Stu("ybx", 12)));
        System.out.println("Json字符串转换为Json对象" + JSON.parseObject(stu1));
    }
}
