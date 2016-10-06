package com.capsurfit.smartchannel.framework.common.shared;

public class EntityConstants {
	public static enum EntitySymbol {
		CHANNEL_CENTER("CHANNEL_CENTER"), 
		DOCTOR("DOCTOR");

		private String entitySymbol;

		private EntitySymbol(String entitySymbol) {
			this.entitySymbol = entitySymbol;
		}

		public String getValue() {
			return entitySymbol;
		}
	}
}
