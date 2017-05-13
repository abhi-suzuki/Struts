package com.mypack;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;
public class MyInterceptor implements Interceptor {

	public void init() {}
	public String intercept(ActionInvocation ai) throws Exception {
		ValueStack stack=ai.getStack();
		System.out.println("Invoke Interceptoor");
		String s=stack.findString("name");
		
		stack.set("name",s.toUpperCase());
		return ai.invoke();
	}
	public void destroy() {}
}
