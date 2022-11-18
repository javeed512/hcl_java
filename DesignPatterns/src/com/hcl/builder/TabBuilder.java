package com.hcl.builder;

public class TabBuilder {

	public TabType buildLenovoTab() {

		TabType lenovoTabType = new TabType();

		lenovoTabType.addItem(new Lenovo());

		return lenovoTabType;

	}

	public TabType buildMicromaxTab() {

		TabType micromaxTabType = new TabType();

		micromaxTabType.addItem(new Micromax());

		return micromaxTabType;

	}
	
	public TabType build(String type) {
		
		
		TabType tabType = new TabType();
		
			if(type.equalsIgnoreCase("Lenovo")) {
				
				tabType.addItem(new Lenovo());
				
			}

			else	if(type.equalsIgnoreCase("Micromax")) {
				
				tabType.addItem(new Micromax());
				
			}
			
			return tabType;
			
			

		
	}
	
	
	

}
