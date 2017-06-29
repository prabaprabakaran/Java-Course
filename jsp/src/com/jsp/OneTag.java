package com.jsp;

import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class OneTag extends TagSupport {
	List<jspone>data;
	
public List<jspone> getData() {
		return data;
	}
	public void setData(List<jspone> data) {
		this.data = data;
	}
@Override
public int doStartTag() throws JspException {
	
	JspWriter js=pageContext.getOut();
	try{
		for(jspone emp:data){
			
			js.println(emp.getId()+" "+emp.getName());
			
		}
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return  Tag.EVAL_PAGE;
}
@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		return super.doAfterBody();
	}
@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return super.doEndTag();
	}
}

