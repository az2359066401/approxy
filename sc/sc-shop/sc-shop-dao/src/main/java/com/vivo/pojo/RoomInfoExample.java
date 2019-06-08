package com.vivo.pojo;

import java.util.ArrayList;
import java.util.List;

public class RoomInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(String value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(String value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(String value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(String value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(String value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLike(String value) {
            addCriterion("room_id like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotLike(String value) {
            addCriterion("room_id not like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<String> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<String> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(String value1, String value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(String value1, String value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRentTypeIsNull() {
            addCriterion("rent_type is null");
            return (Criteria) this;
        }

        public Criteria andRentTypeIsNotNull() {
            addCriterion("rent_type is not null");
            return (Criteria) this;
        }

        public Criteria andRentTypeEqualTo(String value) {
            addCriterion("rent_type =", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotEqualTo(String value) {
            addCriterion("rent_type <>", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThan(String value) {
            addCriterion("rent_type >", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rent_type >=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThan(String value) {
            addCriterion("rent_type <", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThanOrEqualTo(String value) {
            addCriterion("rent_type <=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLike(String value) {
            addCriterion("rent_type like", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotLike(String value) {
            addCriterion("rent_type not like", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeIn(List<String> values) {
            addCriterion("rent_type in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotIn(List<String> values) {
            addCriterion("rent_type not in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeBetween(String value1, String value2) {
            addCriterion("rent_type between", value1, value2, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotBetween(String value1, String value2) {
            addCriterion("rent_type not between", value1, value2, "rentType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(String value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(String value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(String value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(String value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(String value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLike(String value) {
            addCriterion("room_type like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotLike(String value) {
            addCriterion("room_type not like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<String> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<String> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(String value1, String value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(String value1, String value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceIsNull() {
            addCriterion("floor_space is null");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceIsNotNull() {
            addCriterion("floor_space is not null");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceEqualTo(String value) {
            addCriterion("floor_space =", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceNotEqualTo(String value) {
            addCriterion("floor_space <>", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceGreaterThan(String value) {
            addCriterion("floor_space >", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceGreaterThanOrEqualTo(String value) {
            addCriterion("floor_space >=", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceLessThan(String value) {
            addCriterion("floor_space <", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceLessThanOrEqualTo(String value) {
            addCriterion("floor_space <=", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceLike(String value) {
            addCriterion("floor_space like", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceNotLike(String value) {
            addCriterion("floor_space not like", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceIn(List<String> values) {
            addCriterion("floor_space in", values, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceNotIn(List<String> values) {
            addCriterion("floor_space not in", values, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceBetween(String value1, String value2) {
            addCriterion("floor_space between", value1, value2, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceNotBetween(String value1, String value2) {
            addCriterion("floor_space not between", value1, value2, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andRoomDirectIsNull() {
            addCriterion("room_direct is null");
            return (Criteria) this;
        }

        public Criteria andRoomDirectIsNotNull() {
            addCriterion("room_direct is not null");
            return (Criteria) this;
        }

        public Criteria andRoomDirectEqualTo(String value) {
            addCriterion("room_direct =", value, "roomDirect");
            return (Criteria) this;
        }

        public Criteria andRoomDirectNotEqualTo(String value) {
            addCriterion("room_direct <>", value, "roomDirect");
            return (Criteria) this;
        }

        public Criteria andRoomDirectGreaterThan(String value) {
            addCriterion("room_direct >", value, "roomDirect");
            return (Criteria) this;
        }

        public Criteria andRoomDirectGreaterThanOrEqualTo(String value) {
            addCriterion("room_direct >=", value, "roomDirect");
            return (Criteria) this;
        }

        public Criteria andRoomDirectLessThan(String value) {
            addCriterion("room_direct <", value, "roomDirect");
            return (Criteria) this;
        }

        public Criteria andRoomDirectLessThanOrEqualTo(String value) {
            addCriterion("room_direct <=", value, "roomDirect");
            return (Criteria) this;
        }

        public Criteria andRoomDirectLike(String value) {
            addCriterion("room_direct like", value, "roomDirect");
            return (Criteria) this;
        }

        public Criteria andRoomDirectNotLike(String value) {
            addCriterion("room_direct not like", value, "roomDirect");
            return (Criteria) this;
        }

        public Criteria andRoomDirectIn(List<String> values) {
            addCriterion("room_direct in", values, "roomDirect");
            return (Criteria) this;
        }

        public Criteria andRoomDirectNotIn(List<String> values) {
            addCriterion("room_direct not in", values, "roomDirect");
            return (Criteria) this;
        }

        public Criteria andRoomDirectBetween(String value1, String value2) {
            addCriterion("room_direct between", value1, value2, "roomDirect");
            return (Criteria) this;
        }

        public Criteria andRoomDirectNotBetween(String value1, String value2) {
            addCriterion("room_direct not between", value1, value2, "roomDirect");
            return (Criteria) this;
        }

        public Criteria andFloorLevelIsNull() {
            addCriterion("floor_level is null");
            return (Criteria) this;
        }

        public Criteria andFloorLevelIsNotNull() {
            addCriterion("floor_level is not null");
            return (Criteria) this;
        }

        public Criteria andFloorLevelEqualTo(String value) {
            addCriterion("floor_level =", value, "floorLevel");
            return (Criteria) this;
        }

        public Criteria andFloorLevelNotEqualTo(String value) {
            addCriterion("floor_level <>", value, "floorLevel");
            return (Criteria) this;
        }

        public Criteria andFloorLevelGreaterThan(String value) {
            addCriterion("floor_level >", value, "floorLevel");
            return (Criteria) this;
        }

        public Criteria andFloorLevelGreaterThanOrEqualTo(String value) {
            addCriterion("floor_level >=", value, "floorLevel");
            return (Criteria) this;
        }

        public Criteria andFloorLevelLessThan(String value) {
            addCriterion("floor_level <", value, "floorLevel");
            return (Criteria) this;
        }

        public Criteria andFloorLevelLessThanOrEqualTo(String value) {
            addCriterion("floor_level <=", value, "floorLevel");
            return (Criteria) this;
        }

        public Criteria andFloorLevelLike(String value) {
            addCriterion("floor_level like", value, "floorLevel");
            return (Criteria) this;
        }

        public Criteria andFloorLevelNotLike(String value) {
            addCriterion("floor_level not like", value, "floorLevel");
            return (Criteria) this;
        }

        public Criteria andFloorLevelIn(List<String> values) {
            addCriterion("floor_level in", values, "floorLevel");
            return (Criteria) this;
        }

        public Criteria andFloorLevelNotIn(List<String> values) {
            addCriterion("floor_level not in", values, "floorLevel");
            return (Criteria) this;
        }

        public Criteria andFloorLevelBetween(String value1, String value2) {
            addCriterion("floor_level between", value1, value2, "floorLevel");
            return (Criteria) this;
        }

        public Criteria andFloorLevelNotBetween(String value1, String value2) {
            addCriterion("floor_level not between", value1, value2, "floorLevel");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationIsNull() {
            addCriterion("room_decoration is null");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationIsNotNull() {
            addCriterion("room_decoration is not null");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationEqualTo(String value) {
            addCriterion("room_decoration =", value, "roomDecoration");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationNotEqualTo(String value) {
            addCriterion("room_decoration <>", value, "roomDecoration");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationGreaterThan(String value) {
            addCriterion("room_decoration >", value, "roomDecoration");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationGreaterThanOrEqualTo(String value) {
            addCriterion("room_decoration >=", value, "roomDecoration");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationLessThan(String value) {
            addCriterion("room_decoration <", value, "roomDecoration");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationLessThanOrEqualTo(String value) {
            addCriterion("room_decoration <=", value, "roomDecoration");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationLike(String value) {
            addCriterion("room_decoration like", value, "roomDecoration");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationNotLike(String value) {
            addCriterion("room_decoration not like", value, "roomDecoration");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationIn(List<String> values) {
            addCriterion("room_decoration in", values, "roomDecoration");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationNotIn(List<String> values) {
            addCriterion("room_decoration not in", values, "roomDecoration");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationBetween(String value1, String value2) {
            addCriterion("room_decoration between", value1, value2, "roomDecoration");
            return (Criteria) this;
        }

        public Criteria andRoomDecorationNotBetween(String value1, String value2) {
            addCriterion("room_decoration not between", value1, value2, "roomDecoration");
            return (Criteria) this;
        }

        public Criteria andHouseEstateIsNull() {
            addCriterion("house_estate is null");
            return (Criteria) this;
        }

        public Criteria andHouseEstateIsNotNull() {
            addCriterion("house_estate is not null");
            return (Criteria) this;
        }

        public Criteria andHouseEstateEqualTo(String value) {
            addCriterion("house_estate =", value, "houseEstate");
            return (Criteria) this;
        }

        public Criteria andHouseEstateNotEqualTo(String value) {
            addCriterion("house_estate <>", value, "houseEstate");
            return (Criteria) this;
        }

        public Criteria andHouseEstateGreaterThan(String value) {
            addCriterion("house_estate >", value, "houseEstate");
            return (Criteria) this;
        }

        public Criteria andHouseEstateGreaterThanOrEqualTo(String value) {
            addCriterion("house_estate >=", value, "houseEstate");
            return (Criteria) this;
        }

        public Criteria andHouseEstateLessThan(String value) {
            addCriterion("house_estate <", value, "houseEstate");
            return (Criteria) this;
        }

        public Criteria andHouseEstateLessThanOrEqualTo(String value) {
            addCriterion("house_estate <=", value, "houseEstate");
            return (Criteria) this;
        }

        public Criteria andHouseEstateLike(String value) {
            addCriterion("house_estate like", value, "houseEstate");
            return (Criteria) this;
        }

        public Criteria andHouseEstateNotLike(String value) {
            addCriterion("house_estate not like", value, "houseEstate");
            return (Criteria) this;
        }

        public Criteria andHouseEstateIn(List<String> values) {
            addCriterion("house_estate in", values, "houseEstate");
            return (Criteria) this;
        }

        public Criteria andHouseEstateNotIn(List<String> values) {
            addCriterion("house_estate not in", values, "houseEstate");
            return (Criteria) this;
        }

        public Criteria andHouseEstateBetween(String value1, String value2) {
            addCriterion("house_estate between", value1, value2, "houseEstate");
            return (Criteria) this;
        }

        public Criteria andHouseEstateNotBetween(String value1, String value2) {
            addCriterion("house_estate not between", value1, value2, "houseEstate");
            return (Criteria) this;
        }

        public Criteria andRoomAddressIsNull() {
            addCriterion("room_address is null");
            return (Criteria) this;
        }

        public Criteria andRoomAddressIsNotNull() {
            addCriterion("room_address is not null");
            return (Criteria) this;
        }

        public Criteria andRoomAddressEqualTo(String value) {
            addCriterion("room_address =", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressNotEqualTo(String value) {
            addCriterion("room_address <>", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressGreaterThan(String value) {
            addCriterion("room_address >", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressGreaterThanOrEqualTo(String value) {
            addCriterion("room_address >=", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressLessThan(String value) {
            addCriterion("room_address <", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressLessThanOrEqualTo(String value) {
            addCriterion("room_address <=", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressLike(String value) {
            addCriterion("room_address like", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressNotLike(String value) {
            addCriterion("room_address not like", value, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressIn(List<String> values) {
            addCriterion("room_address in", values, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressNotIn(List<String> values) {
            addCriterion("room_address not in", values, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressBetween(String value1, String value2) {
            addCriterion("room_address between", value1, value2, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRoomAddressNotBetween(String value1, String value2) {
            addCriterion("room_address not between", value1, value2, "roomAddress");
            return (Criteria) this;
        }

        public Criteria andRefreshDateIsNull() {
            addCriterion("refresh_date is null");
            return (Criteria) this;
        }

        public Criteria andRefreshDateIsNotNull() {
            addCriterion("refresh_date is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshDateEqualTo(String value) {
            addCriterion("refresh_date =", value, "refreshDate");
            return (Criteria) this;
        }

        public Criteria andRefreshDateNotEqualTo(String value) {
            addCriterion("refresh_date <>", value, "refreshDate");
            return (Criteria) this;
        }

        public Criteria andRefreshDateGreaterThan(String value) {
            addCriterion("refresh_date >", value, "refreshDate");
            return (Criteria) this;
        }

        public Criteria andRefreshDateGreaterThanOrEqualTo(String value) {
            addCriterion("refresh_date >=", value, "refreshDate");
            return (Criteria) this;
        }

        public Criteria andRefreshDateLessThan(String value) {
            addCriterion("refresh_date <", value, "refreshDate");
            return (Criteria) this;
        }

        public Criteria andRefreshDateLessThanOrEqualTo(String value) {
            addCriterion("refresh_date <=", value, "refreshDate");
            return (Criteria) this;
        }

        public Criteria andRefreshDateLike(String value) {
            addCriterion("refresh_date like", value, "refreshDate");
            return (Criteria) this;
        }

        public Criteria andRefreshDateNotLike(String value) {
            addCriterion("refresh_date not like", value, "refreshDate");
            return (Criteria) this;
        }

        public Criteria andRefreshDateIn(List<String> values) {
            addCriterion("refresh_date in", values, "refreshDate");
            return (Criteria) this;
        }

        public Criteria andRefreshDateNotIn(List<String> values) {
            addCriterion("refresh_date not in", values, "refreshDate");
            return (Criteria) this;
        }

        public Criteria andRefreshDateBetween(String value1, String value2) {
            addCriterion("refresh_date between", value1, value2, "refreshDate");
            return (Criteria) this;
        }

        public Criteria andRefreshDateNotBetween(String value1, String value2) {
            addCriterion("refresh_date not between", value1, value2, "refreshDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateIsNull() {
            addCriterion("checkin_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckinDateIsNotNull() {
            addCriterion("checkin_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckinDateEqualTo(String value) {
            addCriterion("checkin_date =", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateNotEqualTo(String value) {
            addCriterion("checkin_date <>", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateGreaterThan(String value) {
            addCriterion("checkin_date >", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateGreaterThanOrEqualTo(String value) {
            addCriterion("checkin_date >=", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateLessThan(String value) {
            addCriterion("checkin_date <", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateLessThanOrEqualTo(String value) {
            addCriterion("checkin_date <=", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateLike(String value) {
            addCriterion("checkin_date like", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateNotLike(String value) {
            addCriterion("checkin_date not like", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateIn(List<String> values) {
            addCriterion("checkin_date in", values, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateNotIn(List<String> values) {
            addCriterion("checkin_date not in", values, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateBetween(String value1, String value2) {
            addCriterion("checkin_date between", value1, value2, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateNotBetween(String value1, String value2) {
            addCriterion("checkin_date not between", value1, value2, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andContactWayIsNull() {
            addCriterion("contact_way is null");
            return (Criteria) this;
        }

        public Criteria andContactWayIsNotNull() {
            addCriterion("contact_way is not null");
            return (Criteria) this;
        }

        public Criteria andContactWayEqualTo(String value) {
            addCriterion("contact_way =", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayNotEqualTo(String value) {
            addCriterion("contact_way <>", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayGreaterThan(String value) {
            addCriterion("contact_way >", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayGreaterThanOrEqualTo(String value) {
            addCriterion("contact_way >=", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayLessThan(String value) {
            addCriterion("contact_way <", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayLessThanOrEqualTo(String value) {
            addCriterion("contact_way <=", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayLike(String value) {
            addCriterion("contact_way like", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayNotLike(String value) {
            addCriterion("contact_way not like", value, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayIn(List<String> values) {
            addCriterion("contact_way in", values, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayNotIn(List<String> values) {
            addCriterion("contact_way not in", values, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayBetween(String value1, String value2) {
            addCriterion("contact_way between", value1, value2, "contactWay");
            return (Criteria) this;
        }

        public Criteria andContactWayNotBetween(String value1, String value2) {
            addCriterion("contact_way not between", value1, value2, "contactWay");
            return (Criteria) this;
        }

        public Criteria andRoomDesIsNull() {
            addCriterion("room_des is null");
            return (Criteria) this;
        }

        public Criteria andRoomDesIsNotNull() {
            addCriterion("room_des is not null");
            return (Criteria) this;
        }

        public Criteria andRoomDesEqualTo(String value) {
            addCriterion("room_des =", value, "roomDes");
            return (Criteria) this;
        }

        public Criteria andRoomDesNotEqualTo(String value) {
            addCriterion("room_des <>", value, "roomDes");
            return (Criteria) this;
        }

        public Criteria andRoomDesGreaterThan(String value) {
            addCriterion("room_des >", value, "roomDes");
            return (Criteria) this;
        }

        public Criteria andRoomDesGreaterThanOrEqualTo(String value) {
            addCriterion("room_des >=", value, "roomDes");
            return (Criteria) this;
        }

        public Criteria andRoomDesLessThan(String value) {
            addCriterion("room_des <", value, "roomDes");
            return (Criteria) this;
        }

        public Criteria andRoomDesLessThanOrEqualTo(String value) {
            addCriterion("room_des <=", value, "roomDes");
            return (Criteria) this;
        }

        public Criteria andRoomDesLike(String value) {
            addCriterion("room_des like", value, "roomDes");
            return (Criteria) this;
        }

        public Criteria andRoomDesNotLike(String value) {
            addCriterion("room_des not like", value, "roomDes");
            return (Criteria) this;
        }

        public Criteria andRoomDesIn(List<String> values) {
            addCriterion("room_des in", values, "roomDes");
            return (Criteria) this;
        }

        public Criteria andRoomDesNotIn(List<String> values) {
            addCriterion("room_des not in", values, "roomDes");
            return (Criteria) this;
        }

        public Criteria andRoomDesBetween(String value1, String value2) {
            addCriterion("room_des between", value1, value2, "roomDes");
            return (Criteria) this;
        }

        public Criteria andRoomDesNotBetween(String value1, String value2) {
            addCriterion("room_des not between", value1, value2, "roomDes");
            return (Criteria) this;
        }

        public Criteria andRoomSupportIsNull() {
            addCriterion("room_support is null");
            return (Criteria) this;
        }

        public Criteria andRoomSupportIsNotNull() {
            addCriterion("room_support is not null");
            return (Criteria) this;
        }

        public Criteria andRoomSupportEqualTo(String value) {
            addCriterion("room_support =", value, "roomSupport");
            return (Criteria) this;
        }

        public Criteria andRoomSupportNotEqualTo(String value) {
            addCriterion("room_support <>", value, "roomSupport");
            return (Criteria) this;
        }

        public Criteria andRoomSupportGreaterThan(String value) {
            addCriterion("room_support >", value, "roomSupport");
            return (Criteria) this;
        }

        public Criteria andRoomSupportGreaterThanOrEqualTo(String value) {
            addCriterion("room_support >=", value, "roomSupport");
            return (Criteria) this;
        }

        public Criteria andRoomSupportLessThan(String value) {
            addCriterion("room_support <", value, "roomSupport");
            return (Criteria) this;
        }

        public Criteria andRoomSupportLessThanOrEqualTo(String value) {
            addCriterion("room_support <=", value, "roomSupport");
            return (Criteria) this;
        }

        public Criteria andRoomSupportLike(String value) {
            addCriterion("room_support like", value, "roomSupport");
            return (Criteria) this;
        }

        public Criteria andRoomSupportNotLike(String value) {
            addCriterion("room_support not like", value, "roomSupport");
            return (Criteria) this;
        }

        public Criteria andRoomSupportIn(List<String> values) {
            addCriterion("room_support in", values, "roomSupport");
            return (Criteria) this;
        }

        public Criteria andRoomSupportNotIn(List<String> values) {
            addCriterion("room_support not in", values, "roomSupport");
            return (Criteria) this;
        }

        public Criteria andRoomSupportBetween(String value1, String value2) {
            addCriterion("room_support between", value1, value2, "roomSupport");
            return (Criteria) this;
        }

        public Criteria andRoomSupportNotBetween(String value1, String value2) {
            addCriterion("room_support not between", value1, value2, "roomSupport");
            return (Criteria) this;
        }

        public Criteria andRoomPicIsNull() {
            addCriterion("room_pic is null");
            return (Criteria) this;
        }

        public Criteria andRoomPicIsNotNull() {
            addCriterion("room_pic is not null");
            return (Criteria) this;
        }

        public Criteria andRoomPicEqualTo(String value) {
            addCriterion("room_pic =", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicNotEqualTo(String value) {
            addCriterion("room_pic <>", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicGreaterThan(String value) {
            addCriterion("room_pic >", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicGreaterThanOrEqualTo(String value) {
            addCriterion("room_pic >=", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicLessThan(String value) {
            addCriterion("room_pic <", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicLessThanOrEqualTo(String value) {
            addCriterion("room_pic <=", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicLike(String value) {
            addCriterion("room_pic like", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicNotLike(String value) {
            addCriterion("room_pic not like", value, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicIn(List<String> values) {
            addCriterion("room_pic in", values, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicNotIn(List<String> values) {
            addCriterion("room_pic not in", values, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicBetween(String value1, String value2) {
            addCriterion("room_pic between", value1, value2, "roomPic");
            return (Criteria) this;
        }

        public Criteria andRoomPicNotBetween(String value1, String value2) {
            addCriterion("room_pic not between", value1, value2, "roomPic");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}