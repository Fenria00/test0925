package test0925;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import test0925.Student;

public class newInstanceDemo {

	public static void main(String[] args) {
		//reflection 龟猭 demo
		Class c = null;
	       try {
	           c = Class.forName("test0925.Student"); //更糶class 惠package name

	           /* (Begin)=============== ネΘン ===============(Begin) */

	           //﹚Constructor┮ㄏノ把计 "篈"
	           Class[] oParam = new Class[2];
	           oParam[0] = String.class;
	           oParam[1] = Integer.TYPE;

	           //玻ネConstructor
	           Constructor constructor = c.getConstructor(oParam);

	           //﹚把计 "ず甧"
	           Object[] paramObjs = new Object[2];
	           paramObjs[0] = "godleon";
	           paramObjs[1] = new Integer(90);

	           //硓筁Constructor玻ネン
	           Object obj = constructor.newInstance(paramObjs);
	           System.out.println(obj);

	           /* (End)=============== ネΘン ===============(End) */


	           /* (Begin)=============== ㊣よ猭 ===============(Begin) */

	           //﹚Method┮ㄏノ把计 "摸"
	           Class[] mParam1 = {String.class}; //Τ把计

	           //玻ネMethod(﹚method嘿籔把计)
	           Method setName = c.getMethod("setName", mParam1);

	           //﹚把计 "ず甧" 
	           Object[] mParamObjs1 = {"godleonxxx"};

	           //㊣よ猭
	           setName.invoke(obj, mParamObjs1); //眖objン ㊣setNameよ猭

	           //﹚Method┮ㄏノ把计 "摸"
	           Class[] mParam2 = {Integer.TYPE};

	           //玻ネMethod(﹚method嘿籔把计)
	           Method setScore = c.getMethod("setScore", mParam2);

	           //﹚把计 "ず甧"
	           Object[] mParamObjs2 = {new Integer(902)};

	           //㊣よ猭
	           setScore.invoke(obj, mParamObjs2); //眖objン ㊣setScoreよ猭

	           //玻ネMethod(﹚method嘿籔把计)
	           Method showData = c.getMethod("showData", null);

	           //㊣よ猭
	           showData.invoke(obj, null);  //㊣showDataよ猭

	           /* (End)=============== ㊣よ猭 ===============(End) */
	       }
	       catch(Exception e) {
	           e.printStackTrace();
	       }
	   }

	}

