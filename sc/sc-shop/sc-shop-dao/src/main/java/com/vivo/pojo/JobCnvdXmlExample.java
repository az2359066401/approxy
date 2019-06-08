package com.vivo.pojo;

import java.util.ArrayList;
import java.util.List;

public class JobCnvdXmlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobCnvdXmlExample() {
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

        public Criteria andDiscoverernameIsNull() {
            addCriterion("discovererName is null");
            return (Criteria) this;
        }

        public Criteria andDiscoverernameIsNotNull() {
            addCriterion("discovererName is not null");
            return (Criteria) this;
        }

        public Criteria andDiscoverernameEqualTo(String value) {
            addCriterion("discovererName =", value, "discoverername");
            return (Criteria) this;
        }

        public Criteria andDiscoverernameNotEqualTo(String value) {
            addCriterion("discovererName <>", value, "discoverername");
            return (Criteria) this;
        }

        public Criteria andDiscoverernameGreaterThan(String value) {
            addCriterion("discovererName >", value, "discoverername");
            return (Criteria) this;
        }

        public Criteria andDiscoverernameGreaterThanOrEqualTo(String value) {
            addCriterion("discovererName >=", value, "discoverername");
            return (Criteria) this;
        }

        public Criteria andDiscoverernameLessThan(String value) {
            addCriterion("discovererName <", value, "discoverername");
            return (Criteria) this;
        }

        public Criteria andDiscoverernameLessThanOrEqualTo(String value) {
            addCriterion("discovererName <=", value, "discoverername");
            return (Criteria) this;
        }

        public Criteria andDiscoverernameLike(String value) {
            addCriterion("discovererName like", value, "discoverername");
            return (Criteria) this;
        }

        public Criteria andDiscoverernameNotLike(String value) {
            addCriterion("discovererName not like", value, "discoverername");
            return (Criteria) this;
        }

        public Criteria andDiscoverernameIn(List<String> values) {
            addCriterion("discovererName in", values, "discoverername");
            return (Criteria) this;
        }

        public Criteria andDiscoverernameNotIn(List<String> values) {
            addCriterion("discovererName not in", values, "discoverername");
            return (Criteria) this;
        }

        public Criteria andDiscoverernameBetween(String value1, String value2) {
            addCriterion("discovererName between", value1, value2, "discoverername");
            return (Criteria) this;
        }

        public Criteria andDiscoverernameNotBetween(String value1, String value2) {
            addCriterion("discovererName not between", value1, value2, "discoverername");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andReferencelinkIsNull() {
            addCriterion("referenceLink is null");
            return (Criteria) this;
        }

        public Criteria andReferencelinkIsNotNull() {
            addCriterion("referenceLink is not null");
            return (Criteria) this;
        }

        public Criteria andReferencelinkEqualTo(String value) {
            addCriterion("referenceLink =", value, "referencelink");
            return (Criteria) this;
        }

        public Criteria andReferencelinkNotEqualTo(String value) {
            addCriterion("referenceLink <>", value, "referencelink");
            return (Criteria) this;
        }

        public Criteria andReferencelinkGreaterThan(String value) {
            addCriterion("referenceLink >", value, "referencelink");
            return (Criteria) this;
        }

        public Criteria andReferencelinkGreaterThanOrEqualTo(String value) {
            addCriterion("referenceLink >=", value, "referencelink");
            return (Criteria) this;
        }

        public Criteria andReferencelinkLessThan(String value) {
            addCriterion("referenceLink <", value, "referencelink");
            return (Criteria) this;
        }

        public Criteria andReferencelinkLessThanOrEqualTo(String value) {
            addCriterion("referenceLink <=", value, "referencelink");
            return (Criteria) this;
        }

        public Criteria andReferencelinkLike(String value) {
            addCriterion("referenceLink like", value, "referencelink");
            return (Criteria) this;
        }

        public Criteria andReferencelinkNotLike(String value) {
            addCriterion("referenceLink not like", value, "referencelink");
            return (Criteria) this;
        }

        public Criteria andReferencelinkIn(List<String> values) {
            addCriterion("referenceLink in", values, "referencelink");
            return (Criteria) this;
        }

        public Criteria andReferencelinkNotIn(List<String> values) {
            addCriterion("referenceLink not in", values, "referencelink");
            return (Criteria) this;
        }

        public Criteria andReferencelinkBetween(String value1, String value2) {
            addCriterion("referenceLink between", value1, value2, "referencelink");
            return (Criteria) this;
        }

        public Criteria andReferencelinkNotBetween(String value1, String value2) {
            addCriterion("referenceLink not between", value1, value2, "referencelink");
            return (Criteria) this;
        }

        public Criteria andCvesIsNull() {
            addCriterion("cves is null");
            return (Criteria) this;
        }

        public Criteria andCvesIsNotNull() {
            addCriterion("cves is not null");
            return (Criteria) this;
        }

        public Criteria andCvesEqualTo(String value) {
            addCriterion("cves =", value, "cves");
            return (Criteria) this;
        }

        public Criteria andCvesNotEqualTo(String value) {
            addCriterion("cves <>", value, "cves");
            return (Criteria) this;
        }

        public Criteria andCvesGreaterThan(String value) {
            addCriterion("cves >", value, "cves");
            return (Criteria) this;
        }

        public Criteria andCvesGreaterThanOrEqualTo(String value) {
            addCriterion("cves >=", value, "cves");
            return (Criteria) this;
        }

        public Criteria andCvesLessThan(String value) {
            addCriterion("cves <", value, "cves");
            return (Criteria) this;
        }

        public Criteria andCvesLessThanOrEqualTo(String value) {
            addCriterion("cves <=", value, "cves");
            return (Criteria) this;
        }

        public Criteria andCvesLike(String value) {
            addCriterion("cves like", value, "cves");
            return (Criteria) this;
        }

        public Criteria andCvesNotLike(String value) {
            addCriterion("cves not like", value, "cves");
            return (Criteria) this;
        }

        public Criteria andCvesIn(List<String> values) {
            addCriterion("cves in", values, "cves");
            return (Criteria) this;
        }

        public Criteria andCvesNotIn(List<String> values) {
            addCriterion("cves not in", values, "cves");
            return (Criteria) this;
        }

        public Criteria andCvesBetween(String value1, String value2) {
            addCriterion("cves between", value1, value2, "cves");
            return (Criteria) this;
        }

        public Criteria andCvesNotBetween(String value1, String value2) {
            addCriterion("cves not between", value1, value2, "cves");
            return (Criteria) this;
        }

        public Criteria andProductsIsNull() {
            addCriterion("products is null");
            return (Criteria) this;
        }

        public Criteria andProductsIsNotNull() {
            addCriterion("products is not null");
            return (Criteria) this;
        }

        public Criteria andProductsEqualTo(String value) {
            addCriterion("products =", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsNotEqualTo(String value) {
            addCriterion("products <>", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsGreaterThan(String value) {
            addCriterion("products >", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsGreaterThanOrEqualTo(String value) {
            addCriterion("products >=", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsLessThan(String value) {
            addCriterion("products <", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsLessThanOrEqualTo(String value) {
            addCriterion("products <=", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsLike(String value) {
            addCriterion("products like", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsNotLike(String value) {
            addCriterion("products not like", value, "products");
            return (Criteria) this;
        }

        public Criteria andProductsIn(List<String> values) {
            addCriterion("products in", values, "products");
            return (Criteria) this;
        }

        public Criteria andProductsNotIn(List<String> values) {
            addCriterion("products not in", values, "products");
            return (Criteria) this;
        }

        public Criteria andProductsBetween(String value1, String value2) {
            addCriterion("products between", value1, value2, "products");
            return (Criteria) this;
        }

        public Criteria andProductsNotBetween(String value1, String value2) {
            addCriterion("products not between", value1, value2, "products");
            return (Criteria) this;
        }

        public Criteria andServerityIsNull() {
            addCriterion("serverity is null");
            return (Criteria) this;
        }

        public Criteria andServerityIsNotNull() {
            addCriterion("serverity is not null");
            return (Criteria) this;
        }

        public Criteria andServerityEqualTo(String value) {
            addCriterion("serverity =", value, "serverity");
            return (Criteria) this;
        }

        public Criteria andServerityNotEqualTo(String value) {
            addCriterion("serverity <>", value, "serverity");
            return (Criteria) this;
        }

        public Criteria andServerityGreaterThan(String value) {
            addCriterion("serverity >", value, "serverity");
            return (Criteria) this;
        }

        public Criteria andServerityGreaterThanOrEqualTo(String value) {
            addCriterion("serverity >=", value, "serverity");
            return (Criteria) this;
        }

        public Criteria andServerityLessThan(String value) {
            addCriterion("serverity <", value, "serverity");
            return (Criteria) this;
        }

        public Criteria andServerityLessThanOrEqualTo(String value) {
            addCriterion("serverity <=", value, "serverity");
            return (Criteria) this;
        }

        public Criteria andServerityLike(String value) {
            addCriterion("serverity like", value, "serverity");
            return (Criteria) this;
        }

        public Criteria andServerityNotLike(String value) {
            addCriterion("serverity not like", value, "serverity");
            return (Criteria) this;
        }

        public Criteria andServerityIn(List<String> values) {
            addCriterion("serverity in", values, "serverity");
            return (Criteria) this;
        }

        public Criteria andServerityNotIn(List<String> values) {
            addCriterion("serverity not in", values, "serverity");
            return (Criteria) this;
        }

        public Criteria andServerityBetween(String value1, String value2) {
            addCriterion("serverity between", value1, value2, "serverity");
            return (Criteria) this;
        }

        public Criteria andServerityNotBetween(String value1, String value2) {
            addCriterion("serverity not between", value1, value2, "serverity");
            return (Criteria) this;
        }

        public Criteria andPatchNameIsNull() {
            addCriterion("patch_name is null");
            return (Criteria) this;
        }

        public Criteria andPatchNameIsNotNull() {
            addCriterion("patch_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatchNameEqualTo(String value) {
            addCriterion("patch_name =", value, "patchName");
            return (Criteria) this;
        }

        public Criteria andPatchNameNotEqualTo(String value) {
            addCriterion("patch_name <>", value, "patchName");
            return (Criteria) this;
        }

        public Criteria andPatchNameGreaterThan(String value) {
            addCriterion("patch_name >", value, "patchName");
            return (Criteria) this;
        }

        public Criteria andPatchNameGreaterThanOrEqualTo(String value) {
            addCriterion("patch_name >=", value, "patchName");
            return (Criteria) this;
        }

        public Criteria andPatchNameLessThan(String value) {
            addCriterion("patch_name <", value, "patchName");
            return (Criteria) this;
        }

        public Criteria andPatchNameLessThanOrEqualTo(String value) {
            addCriterion("patch_name <=", value, "patchName");
            return (Criteria) this;
        }

        public Criteria andPatchNameLike(String value) {
            addCriterion("patch_name like", value, "patchName");
            return (Criteria) this;
        }

        public Criteria andPatchNameNotLike(String value) {
            addCriterion("patch_name not like", value, "patchName");
            return (Criteria) this;
        }

        public Criteria andPatchNameIn(List<String> values) {
            addCriterion("patch_name in", values, "patchName");
            return (Criteria) this;
        }

        public Criteria andPatchNameNotIn(List<String> values) {
            addCriterion("patch_name not in", values, "patchName");
            return (Criteria) this;
        }

        public Criteria andPatchNameBetween(String value1, String value2) {
            addCriterion("patch_name between", value1, value2, "patchName");
            return (Criteria) this;
        }

        public Criteria andPatchNameNotBetween(String value1, String value2) {
            addCriterion("patch_name not between", value1, value2, "patchName");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(String value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(String value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(String value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(String value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(String value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(String value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLike(String value) {
            addCriterion("submit_time like", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotLike(String value) {
            addCriterion("submit_time not like", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<String> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<String> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(String value1, String value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(String value1, String value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andFormalWayIsNull() {
            addCriterion("formal_way is null");
            return (Criteria) this;
        }

        public Criteria andFormalWayIsNotNull() {
            addCriterion("formal_way is not null");
            return (Criteria) this;
        }

        public Criteria andFormalWayEqualTo(String value) {
            addCriterion("formal_way =", value, "formalWay");
            return (Criteria) this;
        }

        public Criteria andFormalWayNotEqualTo(String value) {
            addCriterion("formal_way <>", value, "formalWay");
            return (Criteria) this;
        }

        public Criteria andFormalWayGreaterThan(String value) {
            addCriterion("formal_way >", value, "formalWay");
            return (Criteria) this;
        }

        public Criteria andFormalWayGreaterThanOrEqualTo(String value) {
            addCriterion("formal_way >=", value, "formalWay");
            return (Criteria) this;
        }

        public Criteria andFormalWayLessThan(String value) {
            addCriterion("formal_way <", value, "formalWay");
            return (Criteria) this;
        }

        public Criteria andFormalWayLessThanOrEqualTo(String value) {
            addCriterion("formal_way <=", value, "formalWay");
            return (Criteria) this;
        }

        public Criteria andFormalWayLike(String value) {
            addCriterion("formal_way like", value, "formalWay");
            return (Criteria) this;
        }

        public Criteria andFormalWayNotLike(String value) {
            addCriterion("formal_way not like", value, "formalWay");
            return (Criteria) this;
        }

        public Criteria andFormalWayIn(List<String> values) {
            addCriterion("formal_way in", values, "formalWay");
            return (Criteria) this;
        }

        public Criteria andFormalWayNotIn(List<String> values) {
            addCriterion("formal_way not in", values, "formalWay");
            return (Criteria) this;
        }

        public Criteria andFormalWayBetween(String value1, String value2) {
            addCriterion("formal_way between", value1, value2, "formalWay");
            return (Criteria) this;
        }

        public Criteria andFormalWayNotBetween(String value1, String value2) {
            addCriterion("formal_way not between", value1, value2, "formalWay");
            return (Criteria) this;
        }

        public Criteria andBidsIsNull() {
            addCriterion("bids is null");
            return (Criteria) this;
        }

        public Criteria andBidsIsNotNull() {
            addCriterion("bids is not null");
            return (Criteria) this;
        }

        public Criteria andBidsEqualTo(String value) {
            addCriterion("bids =", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsNotEqualTo(String value) {
            addCriterion("bids <>", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsGreaterThan(String value) {
            addCriterion("bids >", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsGreaterThanOrEqualTo(String value) {
            addCriterion("bids >=", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsLessThan(String value) {
            addCriterion("bids <", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsLessThanOrEqualTo(String value) {
            addCriterion("bids <=", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsLike(String value) {
            addCriterion("bids like", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsNotLike(String value) {
            addCriterion("bids not like", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsIn(List<String> values) {
            addCriterion("bids in", values, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsNotIn(List<String> values) {
            addCriterion("bids not in", values, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsBetween(String value1, String value2) {
            addCriterion("bids between", value1, value2, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsNotBetween(String value1, String value2) {
            addCriterion("bids not between", value1, value2, "bids");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("open_time like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("open_time not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionIsNull() {
            addCriterion("patch_description is null");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionIsNotNull() {
            addCriterion("patch_description is not null");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionEqualTo(String value) {
            addCriterion("patch_description =", value, "patchDescription");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionNotEqualTo(String value) {
            addCriterion("patch_description <>", value, "patchDescription");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionGreaterThan(String value) {
            addCriterion("patch_description >", value, "patchDescription");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("patch_description >=", value, "patchDescription");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionLessThan(String value) {
            addCriterion("patch_description <", value, "patchDescription");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionLessThanOrEqualTo(String value) {
            addCriterion("patch_description <=", value, "patchDescription");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionLike(String value) {
            addCriterion("patch_description like", value, "patchDescription");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionNotLike(String value) {
            addCriterion("patch_description not like", value, "patchDescription");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionIn(List<String> values) {
            addCriterion("patch_description in", values, "patchDescription");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionNotIn(List<String> values) {
            addCriterion("patch_description not in", values, "patchDescription");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionBetween(String value1, String value2) {
            addCriterion("patch_description between", value1, value2, "patchDescription");
            return (Criteria) this;
        }

        public Criteria andPatchDescriptionNotBetween(String value1, String value2) {
            addCriterion("patch_description not between", value1, value2, "patchDescription");
            return (Criteria) this;
        }

        public Criteria andIsEventIsNull() {
            addCriterion("is_event is null");
            return (Criteria) this;
        }

        public Criteria andIsEventIsNotNull() {
            addCriterion("is_event is not null");
            return (Criteria) this;
        }

        public Criteria andIsEventEqualTo(String value) {
            addCriterion("is_event =", value, "isEvent");
            return (Criteria) this;
        }

        public Criteria andIsEventNotEqualTo(String value) {
            addCriterion("is_event <>", value, "isEvent");
            return (Criteria) this;
        }

        public Criteria andIsEventGreaterThan(String value) {
            addCriterion("is_event >", value, "isEvent");
            return (Criteria) this;
        }

        public Criteria andIsEventGreaterThanOrEqualTo(String value) {
            addCriterion("is_event >=", value, "isEvent");
            return (Criteria) this;
        }

        public Criteria andIsEventLessThan(String value) {
            addCriterion("is_event <", value, "isEvent");
            return (Criteria) this;
        }

        public Criteria andIsEventLessThanOrEqualTo(String value) {
            addCriterion("is_event <=", value, "isEvent");
            return (Criteria) this;
        }

        public Criteria andIsEventLike(String value) {
            addCriterion("is_event like", value, "isEvent");
            return (Criteria) this;
        }

        public Criteria andIsEventNotLike(String value) {
            addCriterion("is_event not like", value, "isEvent");
            return (Criteria) this;
        }

        public Criteria andIsEventIn(List<String> values) {
            addCriterion("is_event in", values, "isEvent");
            return (Criteria) this;
        }

        public Criteria andIsEventNotIn(List<String> values) {
            addCriterion("is_event not in", values, "isEvent");
            return (Criteria) this;
        }

        public Criteria andIsEventBetween(String value1, String value2) {
            addCriterion("is_event between", value1, value2, "isEvent");
            return (Criteria) this;
        }

        public Criteria andIsEventNotBetween(String value1, String value2) {
            addCriterion("is_event not between", value1, value2, "isEvent");
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