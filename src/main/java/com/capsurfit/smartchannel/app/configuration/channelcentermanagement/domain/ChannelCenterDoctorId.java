package com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain;

// Generated Nov 30, 2013 1:28:53 PM by Hibernate Tools 3.2.1.GA

public class ChannelCenterDoctorId implements java.io.Serializable {
	private int channelCenterId;
	private int doctorId;

	public ChannelCenterDoctorId() {
	}

	public ChannelCenterDoctorId(int channelCenterId, int doctorId) {
		this.channelCenterId = channelCenterId;
		this.doctorId = doctorId;
	}

	public int getChannelCenterId() {
		return this.channelCenterId;
	}

	public void setChannelCenterId(int channelCenterId) {
		this.channelCenterId = channelCenterId;
	}

	public int getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ChannelCenterDoctorId))
			return false;
		ChannelCenterDoctorId castOther = (ChannelCenterDoctorId) other;

		return (this.getChannelCenterId() == castOther.getChannelCenterId())
				&& (this.getDoctorId() == castOther.getDoctorId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getChannelCenterId();
		result = 37 * result + this.getDoctorId();
		return result;
	}

}
