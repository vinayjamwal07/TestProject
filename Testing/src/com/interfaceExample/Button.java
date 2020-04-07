package com.interfaceExample;

public class Button {
	
	private String title;
	private OnClickListener onClickListener;

	public Button(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public void setonClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
	public void onCllick() {
		this.onClickListener.onClick(title);
	}
	

	public interface OnClickListener{
		public void onClick(String title);
	}
	
	
}
