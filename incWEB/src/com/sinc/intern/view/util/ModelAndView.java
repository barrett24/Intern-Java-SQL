package com.sinc.intern.view.util;

public class ModelAndView {
	private boolean send ;
	private String path ;
	
	public ModelAndView() {
		super();
	}
	
	public ModelAndView(boolean send, String path) {
		super();
		this.send = send;
		this.path = path;
	}

	public boolean isSend() {
		return send;
	}

	public void setSend(boolean send) {
		this.send = send;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "ModelAndView [send=" + send + ", path=" + path + "]";
	}
	
}
