package com.vivo.pojo;

public class RoomInfo {
    private Integer id;

    private String roomId;

    private String rentType;

    private String roomType;

    private String floorSpace;

    private String roomDirect;

    private String floorLevel;

    private String roomDecoration;

    private String houseEstate;

    private String roomAddress;

    private String refreshDate;

    private String checkinDate;

    private String contactWay;

    private String roomDes;

    private String roomSupport;

    private String roomPic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType == null ? null : rentType.trim();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public String getFloorSpace() {
        return floorSpace;
    }

    public void setFloorSpace(String floorSpace) {
        this.floorSpace = floorSpace == null ? null : floorSpace.trim();
    }

    public String getRoomDirect() {
        return roomDirect;
    }

    public void setRoomDirect(String roomDirect) {
        this.roomDirect = roomDirect == null ? null : roomDirect.trim();
    }

    public String getFloorLevel() {
        return floorLevel;
    }

    public void setFloorLevel(String floorLevel) {
        this.floorLevel = floorLevel == null ? null : floorLevel.trim();
    }

    public String getRoomDecoration() {
        return roomDecoration;
    }

    public void setRoomDecoration(String roomDecoration) {
        this.roomDecoration = roomDecoration == null ? null : roomDecoration.trim();
    }

    public String getHouseEstate() {
        return houseEstate;
    }

    public void setHouseEstate(String houseEstate) {
        this.houseEstate = houseEstate == null ? null : houseEstate.trim();
    }

    public String getRoomAddress() {
        return roomAddress;
    }

    public void setRoomAddress(String roomAddress) {
        this.roomAddress = roomAddress == null ? null : roomAddress.trim();
    }

    public String getRefreshDate() {
        return refreshDate;
    }

    public void setRefreshDate(String refreshDate) {
        this.refreshDate = refreshDate == null ? null : refreshDate.trim();
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate == null ? null : checkinDate.trim();
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay == null ? null : contactWay.trim();
    }

    public String getRoomDes() {
        return roomDes;
    }

    public void setRoomDes(String roomDes) {
        this.roomDes = roomDes == null ? null : roomDes.trim();
    }

    public String getRoomSupport() {
        return roomSupport;
    }

    public void setRoomSupport(String roomSupport) {
        this.roomSupport = roomSupport == null ? null : roomSupport.trim();
    }

    public String getRoomPic() {
        return roomPic;
    }

    public void setRoomPic(String roomPic) {
        this.roomPic = roomPic == null ? null : roomPic.trim();
    }
}