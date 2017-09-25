package test0925;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import test0925.Student;

public class newInstanceDemo {

	public static void main(String[] args) {
		//reflection ��@�k demo
		Class c = null;
	       try {
	           c = Class.forName("test0925.Student"); //���J�w�g�n��class �ݥ]�tpackage name

	           /* (Begin)=============== �ͦ����� ===============(Begin) */

	           //���wConstructor�ҨϥΪ��Ѽ� "���A"
	           Class[] oParam = new Class[2];
	           oParam[0] = String.class;
	           oParam[1] = Integer.TYPE;

	           //����Constructor
	           Constructor constructor = c.getConstructor(oParam);

	           //���w�Ѽƪ� "���e"
	           Object[] paramObjs = new Object[2];
	           paramObjs[0] = "godleon";
	           paramObjs[1] = new Integer(90);

	           //�z�LConstructor���ͪ���
	           Object obj = constructor.newInstance(paramObjs);
	           System.out.println(obj);

	           /* (End)=============== �ͦ����� ===============(End) */


	           /* (Begin)=============== �I�s��k ===============(Begin) */

	           //���wMethod�ҨϥΪ��Ѽ� "����"
	           Class[] mParam1 = {String.class}; //�u���@�ӰѼ�

	           //����Method(���wmethod�W�ٻP�Ѽ�)
	           Method setName = c.getMethod("setName", mParam1);

	           //���w�Ѽ� "���e" 
	           Object[] mParamObjs1 = {"godleonxxx"};

	           //�I�s��k
	           setName.invoke(obj, mParamObjs1); //�qobj���� �I�ssetName��k

	           //���wMethod�ҨϥΪ��Ѽ� "����"
	           Class[] mParam2 = {Integer.TYPE};

	           //����Method(���wmethod�W�ٻP�Ѽ�)
	           Method setScore = c.getMethod("setScore", mParam2);

	           //���w�Ѽ� "���e"
	           Object[] mParamObjs2 = {new Integer(902)};

	           //�I�s��k
	           setScore.invoke(obj, mParamObjs2); //�qobj���� �I�ssetScore��k

	           //����Method(���wmethod�W�ٻP�Ѽ�)
	           Method showData = c.getMethod("showData", null);

	           //�I�s��k
	           showData.invoke(obj, null);  //�I�sshowData��k

	           /* (End)=============== �I�s��k ===============(End) */
	       }
	       catch(Exception e) {
	           e.printStackTrace();
	       }
	   }

	}

