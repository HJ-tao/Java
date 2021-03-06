package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * �����ϻ�Mapת��Ϊ�̰߳�ȫ��
 * @author adminitartor
 *
 */
public class SyncApiDemo {
	public static void main(String[] args) {
		/*
		 * ArrayList,LinkedList������
		 * �̰߳�ȫ��
		 */
		List<String> list 
			= new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		/*
		 * ������Listת��Ϊ�̰߳�ȫ��
		 */
		list = Collections.synchronizedList(list);
		System.out.println(list);
		
		//HashSetҲ�����̰߳�ȫ��
		Set<String> set 
			= new HashSet<String>(list);
		System.out.println(set);
		//��������Set����ת��Ϊ�̰߳�ȫ��
		Collections.synchronizedSet(set);
		System.out.println(set);
		
		/*
		 * HashMapҲ�����̰߳�ȫ��
		 */
		Map<String,Integer> map
			= new HashMap<String,Integer>();
		map.put("����", 88);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 89);
		System.out.println(map);
		//������Mapת��Ϊ�̰߳�ȫ��
		map = Collections.synchronizedMap(map);
		System.out.println(map);
		
		
		/*
		 * API�ĵ�Ҳ��˵��:
		 * �̰߳�ȫ�ļ���Ҳ�����������������.
		 * ������ʹ�õ�������������ʱҪ����ά��
		 * �뼯����ɾԪ�صȲ����Ļ����ϵ.����
		 * ���������������������̶߳Լ���Ԫ��
		 * �����˱䶯,�������������׳��쳣.
		 * 
		 */
		
	}
}




