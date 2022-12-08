package org.enargit.code.reflection;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;


import org.enargit.code.entity.BasicEntity;
import org.enargit.code.entity.User;

public class EntityUtil {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Class<BasicEntity> base = BasicEntity.class;
		listTypeParameters(base);
		
		Class<User> userBase = User.class;
		System.out.println(userBase.getGenericSuperclass().getClass().getName());
		Arrays.asList(userBase.getGenericInterfaces()).stream().forEach(c -> System.out.println(c.getClass()) );
		java.lang.reflect.Type type = userBase.getGenericSuperclass();
		System.out.println(type);
		System.out.println(type.getClass());
		Arrays.asList(((ParameterizedType)type).getActualTypeArguments()).stream().forEach( argv -> System.out.println(argv));
		
		
	}
	
	
	
	
	public static void listTypeParameters(Class<?> clz) {
		Arrays.asList(clz.getTypeParameters()).stream().forEach(t -> {
			System.out.println(t.getName());
			Arrays.asList(t.getBounds()).stream().forEach(b -> {				
				System.out.println(b.getTypeName());
			});
		});
	}
	
	
	public static void listAllSuperInterfaces(Class<?> clazz) {
		
	}
	
}
