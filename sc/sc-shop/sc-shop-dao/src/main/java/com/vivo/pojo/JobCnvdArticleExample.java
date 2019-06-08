package com.vivo.pojo;

import java.util.ArrayList;
import java.util.List;

public class JobCnvdArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobCnvdArticleExample() {
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

        public Criteria andBugTitleIsNull() {
            addCriterion("bug_title is null");
            return (Criteria) this;
        }

        public Criteria andBugTitleIsNotNull() {
            addCriterion("bug_title is not null");
            return (Criteria) this;
        }

        public Criteria andBugTitleEqualTo(String value) {
            addCriterion("bug_title =", value, "bugTitle");
            return (Criteria) this;
        }

        public Criteria andBugTitleNotEqualTo(String value) {
            addCriterion("bug_title <>", value, "bugTitle");
            return (Criteria) this;
        }

        public Criteria andBugTitleGreaterThan(String value) {
            addCriterion("bug_title >", value, "bugTitle");
            return (Criteria) this;
        }

        public Criteria andBugTitleGreaterThanOrEqualTo(String value) {
            addCriterion("bug_title >=", value, "bugTitle");
            return (Criteria) this;
        }

        public Criteria andBugTitleLessThan(String value) {
            addCriterion("bug_title <", value, "bugTitle");
            return (Criteria) this;
        }

        public Criteria andBugTitleLessThanOrEqualTo(String value) {
            addCriterion("bug_title <=", value, "bugTitle");
            return (Criteria) this;
        }

        public Criteria andBugTitleLike(String value) {
            addCriterion("bug_title like", value, "bugTitle");
            return (Criteria) this;
        }

        public Criteria andBugTitleNotLike(String value) {
            addCriterion("bug_title not like", value, "bugTitle");
            return (Criteria) this;
        }

        public Criteria andBugTitleIn(List<String> values) {
            addCriterion("bug_title in", values, "bugTitle");
            return (Criteria) this;
        }

        public Criteria andBugTitleNotIn(List<String> values) {
            addCriterion("bug_title not in", values, "bugTitle");
            return (Criteria) this;
        }

        public Criteria andBugTitleBetween(String value1, String value2) {
            addCriterion("bug_title between", value1, value2, "bugTitle");
            return (Criteria) this;
        }

        public Criteria andBugTitleNotBetween(String value1, String value2) {
            addCriterion("bug_title not between", value1, value2, "bugTitle");
            return (Criteria) this;
        }

        public Criteria andCnvdIdIsNull() {
            addCriterion("cnvd_id is null");
            return (Criteria) this;
        }

        public Criteria andCnvdIdIsNotNull() {
            addCriterion("cnvd_id is not null");
            return (Criteria) this;
        }

        public Criteria andCnvdIdEqualTo(String value) {
            addCriterion("cnvd_id =", value, "cnvdId");
            return (Criteria) this;
        }

        public Criteria andCnvdIdNotEqualTo(String value) {
            addCriterion("cnvd_id <>", value, "cnvdId");
            return (Criteria) this;
        }

        public Criteria andCnvdIdGreaterThan(String value) {
            addCriterion("cnvd_id >", value, "cnvdId");
            return (Criteria) this;
        }

        public Criteria andCnvdIdGreaterThanOrEqualTo(String value) {
            addCriterion("cnvd_id >=", value, "cnvdId");
            return (Criteria) this;
        }

        public Criteria andCnvdIdLessThan(String value) {
            addCriterion("cnvd_id <", value, "cnvdId");
            return (Criteria) this;
        }

        public Criteria andCnvdIdLessThanOrEqualTo(String value) {
            addCriterion("cnvd_id <=", value, "cnvdId");
            return (Criteria) this;
        }

        public Criteria andCnvdIdLike(String value) {
            addCriterion("cnvd_id like", value, "cnvdId");
            return (Criteria) this;
        }

        public Criteria andCnvdIdNotLike(String value) {
            addCriterion("cnvd_id not like", value, "cnvdId");
            return (Criteria) this;
        }

        public Criteria andCnvdIdIn(List<String> values) {
            addCriterion("cnvd_id in", values, "cnvdId");
            return (Criteria) this;
        }

        public Criteria andCnvdIdNotIn(List<String> values) {
            addCriterion("cnvd_id not in", values, "cnvdId");
            return (Criteria) this;
        }

        public Criteria andCnvdIdBetween(String value1, String value2) {
            addCriterion("cnvd_id between", value1, value2, "cnvdId");
            return (Criteria) this;
        }

        public Criteria andCnvdIdNotBetween(String value1, String value2) {
            addCriterion("cnvd_id not between", value1, value2, "cnvdId");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdIsNull() {
            addCriterion("bugtraq_id is null");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdIsNotNull() {
            addCriterion("bugtraq_id is not null");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdEqualTo(String value) {
            addCriterion("bugtraq_id =", value, "bugtraqId");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdNotEqualTo(String value) {
            addCriterion("bugtraq_id <>", value, "bugtraqId");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdGreaterThan(String value) {
            addCriterion("bugtraq_id >", value, "bugtraqId");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdGreaterThanOrEqualTo(String value) {
            addCriterion("bugtraq_id >=", value, "bugtraqId");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdLessThan(String value) {
            addCriterion("bugtraq_id <", value, "bugtraqId");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdLessThanOrEqualTo(String value) {
            addCriterion("bugtraq_id <=", value, "bugtraqId");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdLike(String value) {
            addCriterion("bugtraq_id like", value, "bugtraqId");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdNotLike(String value) {
            addCriterion("bugtraq_id not like", value, "bugtraqId");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdIn(List<String> values) {
            addCriterion("bugtraq_id in", values, "bugtraqId");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdNotIn(List<String> values) {
            addCriterion("bugtraq_id not in", values, "bugtraqId");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdBetween(String value1, String value2) {
            addCriterion("bugtraq_id between", value1, value2, "bugtraqId");
            return (Criteria) this;
        }

        public Criteria andBugtraqIdNotBetween(String value1, String value2) {
            addCriterion("bugtraq_id not between", value1, value2, "bugtraqId");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(String value) {
            addCriterion("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(String value) {
            addCriterion("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(String value) {
            addCriterion("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(String value) {
            addCriterion("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(String value) {
            addCriterion("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(String value) {
            addCriterion("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLike(String value) {
            addCriterion("publish_date like", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotLike(String value) {
            addCriterion("publish_date not like", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<String> values) {
            addCriterion("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<String> values) {
            addCriterion("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(String value1, String value2) {
            addCriterion("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(String value1, String value2) {
            addCriterion("publish_date not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andBugLevelIsNull() {
            addCriterion("bug_level is null");
            return (Criteria) this;
        }

        public Criteria andBugLevelIsNotNull() {
            addCriterion("bug_level is not null");
            return (Criteria) this;
        }

        public Criteria andBugLevelEqualTo(String value) {
            addCriterion("bug_level =", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelNotEqualTo(String value) {
            addCriterion("bug_level <>", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelGreaterThan(String value) {
            addCriterion("bug_level >", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelGreaterThanOrEqualTo(String value) {
            addCriterion("bug_level >=", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelLessThan(String value) {
            addCriterion("bug_level <", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelLessThanOrEqualTo(String value) {
            addCriterion("bug_level <=", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelLike(String value) {
            addCriterion("bug_level like", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelNotLike(String value) {
            addCriterion("bug_level not like", value, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelIn(List<String> values) {
            addCriterion("bug_level in", values, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelNotIn(List<String> values) {
            addCriterion("bug_level not in", values, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelBetween(String value1, String value2) {
            addCriterion("bug_level between", value1, value2, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugLevelNotBetween(String value1, String value2) {
            addCriterion("bug_level not between", value1, value2, "bugLevel");
            return (Criteria) this;
        }

        public Criteria andBugFromIsNull() {
            addCriterion("bug_from is null");
            return (Criteria) this;
        }

        public Criteria andBugFromIsNotNull() {
            addCriterion("bug_from is not null");
            return (Criteria) this;
        }

        public Criteria andBugFromEqualTo(String value) {
            addCriterion("bug_from =", value, "bugFrom");
            return (Criteria) this;
        }

        public Criteria andBugFromNotEqualTo(String value) {
            addCriterion("bug_from <>", value, "bugFrom");
            return (Criteria) this;
        }

        public Criteria andBugFromGreaterThan(String value) {
            addCriterion("bug_from >", value, "bugFrom");
            return (Criteria) this;
        }

        public Criteria andBugFromGreaterThanOrEqualTo(String value) {
            addCriterion("bug_from >=", value, "bugFrom");
            return (Criteria) this;
        }

        public Criteria andBugFromLessThan(String value) {
            addCriterion("bug_from <", value, "bugFrom");
            return (Criteria) this;
        }

        public Criteria andBugFromLessThanOrEqualTo(String value) {
            addCriterion("bug_from <=", value, "bugFrom");
            return (Criteria) this;
        }

        public Criteria andBugFromLike(String value) {
            addCriterion("bug_from like", value, "bugFrom");
            return (Criteria) this;
        }

        public Criteria andBugFromNotLike(String value) {
            addCriterion("bug_from not like", value, "bugFrom");
            return (Criteria) this;
        }

        public Criteria andBugFromIn(List<String> values) {
            addCriterion("bug_from in", values, "bugFrom");
            return (Criteria) this;
        }

        public Criteria andBugFromNotIn(List<String> values) {
            addCriterion("bug_from not in", values, "bugFrom");
            return (Criteria) this;
        }

        public Criteria andBugFromBetween(String value1, String value2) {
            addCriterion("bug_from between", value1, value2, "bugFrom");
            return (Criteria) this;
        }

        public Criteria andBugFromNotBetween(String value1, String value2) {
            addCriterion("bug_from not between", value1, value2, "bugFrom");
            return (Criteria) this;
        }

        public Criteria andBugTypeIsNull() {
            addCriterion("bug_type is null");
            return (Criteria) this;
        }

        public Criteria andBugTypeIsNotNull() {
            addCriterion("bug_type is not null");
            return (Criteria) this;
        }

        public Criteria andBugTypeEqualTo(String value) {
            addCriterion("bug_type =", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeNotEqualTo(String value) {
            addCriterion("bug_type <>", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeGreaterThan(String value) {
            addCriterion("bug_type >", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bug_type >=", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeLessThan(String value) {
            addCriterion("bug_type <", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeLessThanOrEqualTo(String value) {
            addCriterion("bug_type <=", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeLike(String value) {
            addCriterion("bug_type like", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeNotLike(String value) {
            addCriterion("bug_type not like", value, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeIn(List<String> values) {
            addCriterion("bug_type in", values, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeNotIn(List<String> values) {
            addCriterion("bug_type not in", values, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeBetween(String value1, String value2) {
            addCriterion("bug_type between", value1, value2, "bugType");
            return (Criteria) this;
        }

        public Criteria andBugTypeNotBetween(String value1, String value2) {
            addCriterion("bug_type not between", value1, value2, "bugType");
            return (Criteria) this;
        }

        public Criteria andCveIdIsNull() {
            addCriterion("cve_id is null");
            return (Criteria) this;
        }

        public Criteria andCveIdIsNotNull() {
            addCriterion("cve_id is not null");
            return (Criteria) this;
        }

        public Criteria andCveIdEqualTo(String value) {
            addCriterion("cve_id =", value, "cveId");
            return (Criteria) this;
        }

        public Criteria andCveIdNotEqualTo(String value) {
            addCriterion("cve_id <>", value, "cveId");
            return (Criteria) this;
        }

        public Criteria andCveIdGreaterThan(String value) {
            addCriterion("cve_id >", value, "cveId");
            return (Criteria) this;
        }

        public Criteria andCveIdGreaterThanOrEqualTo(String value) {
            addCriterion("cve_id >=", value, "cveId");
            return (Criteria) this;
        }

        public Criteria andCveIdLessThan(String value) {
            addCriterion("cve_id <", value, "cveId");
            return (Criteria) this;
        }

        public Criteria andCveIdLessThanOrEqualTo(String value) {
            addCriterion("cve_id <=", value, "cveId");
            return (Criteria) this;
        }

        public Criteria andCveIdLike(String value) {
            addCriterion("cve_id like", value, "cveId");
            return (Criteria) this;
        }

        public Criteria andCveIdNotLike(String value) {
            addCriterion("cve_id not like", value, "cveId");
            return (Criteria) this;
        }

        public Criteria andCveIdIn(List<String> values) {
            addCriterion("cve_id in", values, "cveId");
            return (Criteria) this;
        }

        public Criteria andCveIdNotIn(List<String> values) {
            addCriterion("cve_id not in", values, "cveId");
            return (Criteria) this;
        }

        public Criteria andCveIdBetween(String value1, String value2) {
            addCriterion("cve_id between", value1, value2, "cveId");
            return (Criteria) this;
        }

        public Criteria andCveIdNotBetween(String value1, String value2) {
            addCriterion("cve_id not between", value1, value2, "cveId");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkIsNull() {
            addCriterion("cve_id_link is null");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkIsNotNull() {
            addCriterion("cve_id_link is not null");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkEqualTo(String value) {
            addCriterion("cve_id_link =", value, "cveIdLink");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkNotEqualTo(String value) {
            addCriterion("cve_id_link <>", value, "cveIdLink");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkGreaterThan(String value) {
            addCriterion("cve_id_link >", value, "cveIdLink");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkGreaterThanOrEqualTo(String value) {
            addCriterion("cve_id_link >=", value, "cveIdLink");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkLessThan(String value) {
            addCriterion("cve_id_link <", value, "cveIdLink");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkLessThanOrEqualTo(String value) {
            addCriterion("cve_id_link <=", value, "cveIdLink");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkLike(String value) {
            addCriterion("cve_id_link like", value, "cveIdLink");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkNotLike(String value) {
            addCriterion("cve_id_link not like", value, "cveIdLink");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkIn(List<String> values) {
            addCriterion("cve_id_link in", values, "cveIdLink");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkNotIn(List<String> values) {
            addCriterion("cve_id_link not in", values, "cveIdLink");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkBetween(String value1, String value2) {
            addCriterion("cve_id_link between", value1, value2, "cveIdLink");
            return (Criteria) this;
        }

        public Criteria andCveIdLinkNotBetween(String value1, String value2) {
            addCriterion("cve_id_link not between", value1, value2, "cveIdLink");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkIsNull() {
            addCriterion("bug_patch_link is null");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkIsNotNull() {
            addCriterion("bug_patch_link is not null");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkEqualTo(String value) {
            addCriterion("bug_patch_link =", value, "bugPatchLink");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkNotEqualTo(String value) {
            addCriterion("bug_patch_link <>", value, "bugPatchLink");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkGreaterThan(String value) {
            addCriterion("bug_patch_link >", value, "bugPatchLink");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkGreaterThanOrEqualTo(String value) {
            addCriterion("bug_patch_link >=", value, "bugPatchLink");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkLessThan(String value) {
            addCriterion("bug_patch_link <", value, "bugPatchLink");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkLessThanOrEqualTo(String value) {
            addCriterion("bug_patch_link <=", value, "bugPatchLink");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkLike(String value) {
            addCriterion("bug_patch_link like", value, "bugPatchLink");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkNotLike(String value) {
            addCriterion("bug_patch_link not like", value, "bugPatchLink");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkIn(List<String> values) {
            addCriterion("bug_patch_link in", values, "bugPatchLink");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkNotIn(List<String> values) {
            addCriterion("bug_patch_link not in", values, "bugPatchLink");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkBetween(String value1, String value2) {
            addCriterion("bug_patch_link between", value1, value2, "bugPatchLink");
            return (Criteria) this;
        }

        public Criteria andBugPatchLinkNotBetween(String value1, String value2) {
            addCriterion("bug_patch_link not between", value1, value2, "bugPatchLink");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgIsNull() {
            addCriterion("verify_falg is null");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgIsNotNull() {
            addCriterion("verify_falg is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgEqualTo(String value) {
            addCriterion("verify_falg =", value, "verifyFalg");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgNotEqualTo(String value) {
            addCriterion("verify_falg <>", value, "verifyFalg");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgGreaterThan(String value) {
            addCriterion("verify_falg >", value, "verifyFalg");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgGreaterThanOrEqualTo(String value) {
            addCriterion("verify_falg >=", value, "verifyFalg");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgLessThan(String value) {
            addCriterion("verify_falg <", value, "verifyFalg");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgLessThanOrEqualTo(String value) {
            addCriterion("verify_falg <=", value, "verifyFalg");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgLike(String value) {
            addCriterion("verify_falg like", value, "verifyFalg");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgNotLike(String value) {
            addCriterion("verify_falg not like", value, "verifyFalg");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgIn(List<String> values) {
            addCriterion("verify_falg in", values, "verifyFalg");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgNotIn(List<String> values) {
            addCriterion("verify_falg not in", values, "verifyFalg");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgBetween(String value1, String value2) {
            addCriterion("verify_falg between", value1, value2, "verifyFalg");
            return (Criteria) this;
        }

        public Criteria andVerifyFalgNotBetween(String value1, String value2) {
            addCriterion("verify_falg not between", value1, value2, "verifyFalg");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNull() {
            addCriterion("submit_date is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("submit_date is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(String value) {
            addCriterion("submit_date =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(String value) {
            addCriterion("submit_date <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(String value) {
            addCriterion("submit_date >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(String value) {
            addCriterion("submit_date >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(String value) {
            addCriterion("submit_date <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(String value) {
            addCriterion("submit_date <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLike(String value) {
            addCriterion("submit_date like", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotLike(String value) {
            addCriterion("submit_date not like", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<String> values) {
            addCriterion("submit_date in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<String> values) {
            addCriterion("submit_date not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(String value1, String value2) {
            addCriterion("submit_date between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(String value1, String value2) {
            addCriterion("submit_date not between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNull() {
            addCriterion("record_date is null");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNotNull() {
            addCriterion("record_date is not null");
            return (Criteria) this;
        }

        public Criteria andRecordDateEqualTo(String value) {
            addCriterion("record_date =", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotEqualTo(String value) {
            addCriterion("record_date <>", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThan(String value) {
            addCriterion("record_date >", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThanOrEqualTo(String value) {
            addCriterion("record_date >=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThan(String value) {
            addCriterion("record_date <", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThanOrEqualTo(String value) {
            addCriterion("record_date <=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLike(String value) {
            addCriterion("record_date like", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotLike(String value) {
            addCriterion("record_date not like", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateIn(List<String> values) {
            addCriterion("record_date in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotIn(List<String> values) {
            addCriterion("record_date not in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateBetween(String value1, String value2) {
            addCriterion("record_date between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotBetween(String value1, String value2) {
            addCriterion("record_date not between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(String value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(String value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(String value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(String value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(String value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(String value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLike(String value) {
            addCriterion("update_date like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotLike(String value) {
            addCriterion("update_date not like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<String> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<String> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(String value1, String value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(String value1, String value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentIsNull() {
            addCriterion("bug_attachment is null");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentIsNotNull() {
            addCriterion("bug_attachment is not null");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentEqualTo(String value) {
            addCriterion("bug_attachment =", value, "bugAttachment");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentNotEqualTo(String value) {
            addCriterion("bug_attachment <>", value, "bugAttachment");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentGreaterThan(String value) {
            addCriterion("bug_attachment >", value, "bugAttachment");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("bug_attachment >=", value, "bugAttachment");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentLessThan(String value) {
            addCriterion("bug_attachment <", value, "bugAttachment");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentLessThanOrEqualTo(String value) {
            addCriterion("bug_attachment <=", value, "bugAttachment");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentLike(String value) {
            addCriterion("bug_attachment like", value, "bugAttachment");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentNotLike(String value) {
            addCriterion("bug_attachment not like", value, "bugAttachment");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentIn(List<String> values) {
            addCriterion("bug_attachment in", values, "bugAttachment");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentNotIn(List<String> values) {
            addCriterion("bug_attachment not in", values, "bugAttachment");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentBetween(String value1, String value2) {
            addCriterion("bug_attachment between", value1, value2, "bugAttachment");
            return (Criteria) this;
        }

        public Criteria andBugAttachmentNotBetween(String value1, String value2) {
            addCriterion("bug_attachment not between", value1, value2, "bugAttachment");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(String value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(String value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(String value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(String value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(String value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(String value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLike(String value) {
            addCriterion("hits like", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotLike(String value) {
            addCriterion("hits not like", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<String> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<String> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(String value1, String value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(String value1, String value2) {
            addCriterion("hits not between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("create_date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("create_date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIsNull() {
            addCriterion("key_words is null");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIsNotNull() {
            addCriterion("key_words is not null");
            return (Criteria) this;
        }

        public Criteria andKeyWordsEqualTo(String value) {
            addCriterion("key_words =", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotEqualTo(String value) {
            addCriterion("key_words <>", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThan(String value) {
            addCriterion("key_words >", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThanOrEqualTo(String value) {
            addCriterion("key_words >=", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThan(String value) {
            addCriterion("key_words <", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThanOrEqualTo(String value) {
            addCriterion("key_words <=", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLike(String value) {
            addCriterion("key_words like", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotLike(String value) {
            addCriterion("key_words not like", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIn(List<String> values) {
            addCriterion("key_words in", values, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotIn(List<String> values) {
            addCriterion("key_words not in", values, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsBetween(String value1, String value2) {
            addCriterion("key_words between", value1, value2, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotBetween(String value1, String value2) {
            addCriterion("key_words not between", value1, value2, "keyWords");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andBugVersionIsNull() {
            addCriterion("bug_version is null");
            return (Criteria) this;
        }

        public Criteria andBugVersionIsNotNull() {
            addCriterion("bug_version is not null");
            return (Criteria) this;
        }

        public Criteria andBugVersionEqualTo(String value) {
            addCriterion("bug_version =", value, "bugVersion");
            return (Criteria) this;
        }

        public Criteria andBugVersionNotEqualTo(String value) {
            addCriterion("bug_version <>", value, "bugVersion");
            return (Criteria) this;
        }

        public Criteria andBugVersionGreaterThan(String value) {
            addCriterion("bug_version >", value, "bugVersion");
            return (Criteria) this;
        }

        public Criteria andBugVersionGreaterThanOrEqualTo(String value) {
            addCriterion("bug_version >=", value, "bugVersion");
            return (Criteria) this;
        }

        public Criteria andBugVersionLessThan(String value) {
            addCriterion("bug_version <", value, "bugVersion");
            return (Criteria) this;
        }

        public Criteria andBugVersionLessThanOrEqualTo(String value) {
            addCriterion("bug_version <=", value, "bugVersion");
            return (Criteria) this;
        }

        public Criteria andBugVersionLike(String value) {
            addCriterion("bug_version like", value, "bugVersion");
            return (Criteria) this;
        }

        public Criteria andBugVersionNotLike(String value) {
            addCriterion("bug_version not like", value, "bugVersion");
            return (Criteria) this;
        }

        public Criteria andBugVersionIn(List<String> values) {
            addCriterion("bug_version in", values, "bugVersion");
            return (Criteria) this;
        }

        public Criteria andBugVersionNotIn(List<String> values) {
            addCriterion("bug_version not in", values, "bugVersion");
            return (Criteria) this;
        }

        public Criteria andBugVersionBetween(String value1, String value2) {
            addCriterion("bug_version between", value1, value2, "bugVersion");
            return (Criteria) this;
        }

        public Criteria andBugVersionNotBetween(String value1, String value2) {
            addCriterion("bug_version not between", value1, value2, "bugVersion");
            return (Criteria) this;
        }

        public Criteria andBugReasonIsNull() {
            addCriterion("bug_reason is null");
            return (Criteria) this;
        }

        public Criteria andBugReasonIsNotNull() {
            addCriterion("bug_reason is not null");
            return (Criteria) this;
        }

        public Criteria andBugReasonEqualTo(String value) {
            addCriterion("bug_reason =", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonNotEqualTo(String value) {
            addCriterion("bug_reason <>", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonGreaterThan(String value) {
            addCriterion("bug_reason >", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonGreaterThanOrEqualTo(String value) {
            addCriterion("bug_reason >=", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonLessThan(String value) {
            addCriterion("bug_reason <", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonLessThanOrEqualTo(String value) {
            addCriterion("bug_reason <=", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonLike(String value) {
            addCriterion("bug_reason like", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonNotLike(String value) {
            addCriterion("bug_reason not like", value, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonIn(List<String> values) {
            addCriterion("bug_reason in", values, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonNotIn(List<String> values) {
            addCriterion("bug_reason not in", values, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonBetween(String value1, String value2) {
            addCriterion("bug_reason between", value1, value2, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugReasonNotBetween(String value1, String value2) {
            addCriterion("bug_reason not between", value1, value2, "bugReason");
            return (Criteria) this;
        }

        public Criteria andBugThreatIsNull() {
            addCriterion("bug_threat is null");
            return (Criteria) this;
        }

        public Criteria andBugThreatIsNotNull() {
            addCriterion("bug_threat is not null");
            return (Criteria) this;
        }

        public Criteria andBugThreatEqualTo(String value) {
            addCriterion("bug_threat =", value, "bugThreat");
            return (Criteria) this;
        }

        public Criteria andBugThreatNotEqualTo(String value) {
            addCriterion("bug_threat <>", value, "bugThreat");
            return (Criteria) this;
        }

        public Criteria andBugThreatGreaterThan(String value) {
            addCriterion("bug_threat >", value, "bugThreat");
            return (Criteria) this;
        }

        public Criteria andBugThreatGreaterThanOrEqualTo(String value) {
            addCriterion("bug_threat >=", value, "bugThreat");
            return (Criteria) this;
        }

        public Criteria andBugThreatLessThan(String value) {
            addCriterion("bug_threat <", value, "bugThreat");
            return (Criteria) this;
        }

        public Criteria andBugThreatLessThanOrEqualTo(String value) {
            addCriterion("bug_threat <=", value, "bugThreat");
            return (Criteria) this;
        }

        public Criteria andBugThreatLike(String value) {
            addCriterion("bug_threat like", value, "bugThreat");
            return (Criteria) this;
        }

        public Criteria andBugThreatNotLike(String value) {
            addCriterion("bug_threat not like", value, "bugThreat");
            return (Criteria) this;
        }

        public Criteria andBugThreatIn(List<String> values) {
            addCriterion("bug_threat in", values, "bugThreat");
            return (Criteria) this;
        }

        public Criteria andBugThreatNotIn(List<String> values) {
            addCriterion("bug_threat not in", values, "bugThreat");
            return (Criteria) this;
        }

        public Criteria andBugThreatBetween(String value1, String value2) {
            addCriterion("bug_threat between", value1, value2, "bugThreat");
            return (Criteria) this;
        }

        public Criteria andBugThreatNotBetween(String value1, String value2) {
            addCriterion("bug_threat not between", value1, value2, "bugThreat");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionIsNull() {
            addCriterion("bug_attack_position is null");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionIsNotNull() {
            addCriterion("bug_attack_position is not null");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionEqualTo(String value) {
            addCriterion("bug_attack_position =", value, "bugAttackPosition");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionNotEqualTo(String value) {
            addCriterion("bug_attack_position <>", value, "bugAttackPosition");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionGreaterThan(String value) {
            addCriterion("bug_attack_position >", value, "bugAttackPosition");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionGreaterThanOrEqualTo(String value) {
            addCriterion("bug_attack_position >=", value, "bugAttackPosition");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionLessThan(String value) {
            addCriterion("bug_attack_position <", value, "bugAttackPosition");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionLessThanOrEqualTo(String value) {
            addCriterion("bug_attack_position <=", value, "bugAttackPosition");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionLike(String value) {
            addCriterion("bug_attack_position like", value, "bugAttackPosition");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionNotLike(String value) {
            addCriterion("bug_attack_position not like", value, "bugAttackPosition");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionIn(List<String> values) {
            addCriterion("bug_attack_position in", values, "bugAttackPosition");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionNotIn(List<String> values) {
            addCriterion("bug_attack_position not in", values, "bugAttackPosition");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionBetween(String value1, String value2) {
            addCriterion("bug_attack_position between", value1, value2, "bugAttackPosition");
            return (Criteria) this;
        }

        public Criteria andBugAttackPositionNotBetween(String value1, String value2) {
            addCriterion("bug_attack_position not between", value1, value2, "bugAttackPosition");
            return (Criteria) this;
        }

        public Criteria andCveScoreIsNull() {
            addCriterion("cve_score is null");
            return (Criteria) this;
        }

        public Criteria andCveScoreIsNotNull() {
            addCriterion("cve_score is not null");
            return (Criteria) this;
        }

        public Criteria andCveScoreEqualTo(String value) {
            addCriterion("cve_score =", value, "cveScore");
            return (Criteria) this;
        }

        public Criteria andCveScoreNotEqualTo(String value) {
            addCriterion("cve_score <>", value, "cveScore");
            return (Criteria) this;
        }

        public Criteria andCveScoreGreaterThan(String value) {
            addCriterion("cve_score >", value, "cveScore");
            return (Criteria) this;
        }

        public Criteria andCveScoreGreaterThanOrEqualTo(String value) {
            addCriterion("cve_score >=", value, "cveScore");
            return (Criteria) this;
        }

        public Criteria andCveScoreLessThan(String value) {
            addCriterion("cve_score <", value, "cveScore");
            return (Criteria) this;
        }

        public Criteria andCveScoreLessThanOrEqualTo(String value) {
            addCriterion("cve_score <=", value, "cveScore");
            return (Criteria) this;
        }

        public Criteria andCveScoreLike(String value) {
            addCriterion("cve_score like", value, "cveScore");
            return (Criteria) this;
        }

        public Criteria andCveScoreNotLike(String value) {
            addCriterion("cve_score not like", value, "cveScore");
            return (Criteria) this;
        }

        public Criteria andCveScoreIn(List<String> values) {
            addCriterion("cve_score in", values, "cveScore");
            return (Criteria) this;
        }

        public Criteria andCveScoreNotIn(List<String> values) {
            addCriterion("cve_score not in", values, "cveScore");
            return (Criteria) this;
        }

        public Criteria andCveScoreBetween(String value1, String value2) {
            addCriterion("cve_score between", value1, value2, "cveScore");
            return (Criteria) this;
        }

        public Criteria andCveScoreNotBetween(String value1, String value2) {
            addCriterion("cve_score not between", value1, value2, "cveScore");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("ext1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt3IsNull() {
            addCriterion("ext3 is null");
            return (Criteria) this;
        }

        public Criteria andExt3IsNotNull() {
            addCriterion("ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt3EqualTo(String value) {
            addCriterion("ext3 =", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotEqualTo(String value) {
            addCriterion("ext3 <>", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThan(String value) {
            addCriterion("ext3 >", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ext3 >=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThan(String value) {
            addCriterion("ext3 <", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThanOrEqualTo(String value) {
            addCriterion("ext3 <=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Like(String value) {
            addCriterion("ext3 like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotLike(String value) {
            addCriterion("ext3 not like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3In(List<String> values) {
            addCriterion("ext3 in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotIn(List<String> values) {
            addCriterion("ext3 not in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Between(String value1, String value2) {
            addCriterion("ext3 between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotBetween(String value1, String value2) {
            addCriterion("ext3 not between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt4IsNull() {
            addCriterion("ext4 is null");
            return (Criteria) this;
        }

        public Criteria andExt4IsNotNull() {
            addCriterion("ext4 is not null");
            return (Criteria) this;
        }

        public Criteria andExt4EqualTo(String value) {
            addCriterion("ext4 =", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotEqualTo(String value) {
            addCriterion("ext4 <>", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThan(String value) {
            addCriterion("ext4 >", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThanOrEqualTo(String value) {
            addCriterion("ext4 >=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThan(String value) {
            addCriterion("ext4 <", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThanOrEqualTo(String value) {
            addCriterion("ext4 <=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Like(String value) {
            addCriterion("ext4 like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotLike(String value) {
            addCriterion("ext4 not like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4In(List<String> values) {
            addCriterion("ext4 in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotIn(List<String> values) {
            addCriterion("ext4 not in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Between(String value1, String value2) {
            addCriterion("ext4 between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotBetween(String value1, String value2) {
            addCriterion("ext4 not between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt5IsNull() {
            addCriterion("ext5 is null");
            return (Criteria) this;
        }

        public Criteria andExt5IsNotNull() {
            addCriterion("ext5 is not null");
            return (Criteria) this;
        }

        public Criteria andExt5EqualTo(String value) {
            addCriterion("ext5 =", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotEqualTo(String value) {
            addCriterion("ext5 <>", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThan(String value) {
            addCriterion("ext5 >", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThanOrEqualTo(String value) {
            addCriterion("ext5 >=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThan(String value) {
            addCriterion("ext5 <", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThanOrEqualTo(String value) {
            addCriterion("ext5 <=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Like(String value) {
            addCriterion("ext5 like", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotLike(String value) {
            addCriterion("ext5 not like", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5In(List<String> values) {
            addCriterion("ext5 in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotIn(List<String> values) {
            addCriterion("ext5 not in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Between(String value1, String value2) {
            addCriterion("ext5 between", value1, value2, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotBetween(String value1, String value2) {
            addCriterion("ext5 not between", value1, value2, "ext5");
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