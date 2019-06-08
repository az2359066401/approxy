package com.vivo.pojo;

import java.util.ArrayList;
import java.util.List;

public class JobCnnvdXmlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobCnnvdXmlExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andVulnIdIsNull() {
            addCriterion("vuln_id is null");
            return (Criteria) this;
        }

        public Criteria andVulnIdIsNotNull() {
            addCriterion("vuln_id is not null");
            return (Criteria) this;
        }

        public Criteria andVulnIdEqualTo(String value) {
            addCriterion("vuln_id =", value, "vulnId");
            return (Criteria) this;
        }

        public Criteria andVulnIdNotEqualTo(String value) {
            addCriterion("vuln_id <>", value, "vulnId");
            return (Criteria) this;
        }

        public Criteria andVulnIdGreaterThan(String value) {
            addCriterion("vuln_id >", value, "vulnId");
            return (Criteria) this;
        }

        public Criteria andVulnIdGreaterThanOrEqualTo(String value) {
            addCriterion("vuln_id >=", value, "vulnId");
            return (Criteria) this;
        }

        public Criteria andVulnIdLessThan(String value) {
            addCriterion("vuln_id <", value, "vulnId");
            return (Criteria) this;
        }

        public Criteria andVulnIdLessThanOrEqualTo(String value) {
            addCriterion("vuln_id <=", value, "vulnId");
            return (Criteria) this;
        }

        public Criteria andVulnIdLike(String value) {
            addCriterion("vuln_id like", value, "vulnId");
            return (Criteria) this;
        }

        public Criteria andVulnIdNotLike(String value) {
            addCriterion("vuln_id not like", value, "vulnId");
            return (Criteria) this;
        }

        public Criteria andVulnIdIn(List<String> values) {
            addCriterion("vuln_id in", values, "vulnId");
            return (Criteria) this;
        }

        public Criteria andVulnIdNotIn(List<String> values) {
            addCriterion("vuln_id not in", values, "vulnId");
            return (Criteria) this;
        }

        public Criteria andVulnIdBetween(String value1, String value2) {
            addCriterion("vuln_id between", value1, value2, "vulnId");
            return (Criteria) this;
        }

        public Criteria andVulnIdNotBetween(String value1, String value2) {
            addCriterion("vuln_id not between", value1, value2, "vulnId");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNull() {
            addCriterion("published is null");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNotNull() {
            addCriterion("published is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedEqualTo(String value) {
            addCriterion("published =", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotEqualTo(String value) {
            addCriterion("published <>", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThan(String value) {
            addCriterion("published >", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThanOrEqualTo(String value) {
            addCriterion("published >=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThan(String value) {
            addCriterion("published <", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThanOrEqualTo(String value) {
            addCriterion("published <=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLike(String value) {
            addCriterion("published like", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotLike(String value) {
            addCriterion("published not like", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedIn(List<String> values) {
            addCriterion("published in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotIn(List<String> values) {
            addCriterion("published not in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedBetween(String value1, String value2) {
            addCriterion("published between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotBetween(String value1, String value2) {
            addCriterion("published not between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(String value) {
            addCriterion("modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(String value) {
            addCriterion("modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(String value) {
            addCriterion("modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(String value) {
            addCriterion("modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(String value) {
            addCriterion("modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(String value) {
            addCriterion("modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLike(String value) {
            addCriterion("modified like", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotLike(String value) {
            addCriterion("modified not like", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<String> values) {
            addCriterion("modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<String> values) {
            addCriterion("modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(String value1, String value2) {
            addCriterion("modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(String value1, String value2) {
            addCriterion("modified not between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSeverityIsNull() {
            addCriterion("severity is null");
            return (Criteria) this;
        }

        public Criteria andSeverityIsNotNull() {
            addCriterion("severity is not null");
            return (Criteria) this;
        }

        public Criteria andSeverityEqualTo(String value) {
            addCriterion("severity =", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotEqualTo(String value) {
            addCriterion("severity <>", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityGreaterThan(String value) {
            addCriterion("severity >", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityGreaterThanOrEqualTo(String value) {
            addCriterion("severity >=", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityLessThan(String value) {
            addCriterion("severity <", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityLessThanOrEqualTo(String value) {
            addCriterion("severity <=", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityLike(String value) {
            addCriterion("severity like", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotLike(String value) {
            addCriterion("severity not like", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityIn(List<String> values) {
            addCriterion("severity in", values, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotIn(List<String> values) {
            addCriterion("severity not in", values, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityBetween(String value1, String value2) {
            addCriterion("severity between", value1, value2, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotBetween(String value1, String value2) {
            addCriterion("severity not between", value1, value2, "severity");
            return (Criteria) this;
        }

        public Criteria andVulnTypeIsNull() {
            addCriterion("vuln_type is null");
            return (Criteria) this;
        }

        public Criteria andVulnTypeIsNotNull() {
            addCriterion("vuln_type is not null");
            return (Criteria) this;
        }

        public Criteria andVulnTypeEqualTo(String value) {
            addCriterion("vuln_type =", value, "vulnType");
            return (Criteria) this;
        }

        public Criteria andVulnTypeNotEqualTo(String value) {
            addCriterion("vuln_type <>", value, "vulnType");
            return (Criteria) this;
        }

        public Criteria andVulnTypeGreaterThan(String value) {
            addCriterion("vuln_type >", value, "vulnType");
            return (Criteria) this;
        }

        public Criteria andVulnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vuln_type >=", value, "vulnType");
            return (Criteria) this;
        }

        public Criteria andVulnTypeLessThan(String value) {
            addCriterion("vuln_type <", value, "vulnType");
            return (Criteria) this;
        }

        public Criteria andVulnTypeLessThanOrEqualTo(String value) {
            addCriterion("vuln_type <=", value, "vulnType");
            return (Criteria) this;
        }

        public Criteria andVulnTypeLike(String value) {
            addCriterion("vuln_type like", value, "vulnType");
            return (Criteria) this;
        }

        public Criteria andVulnTypeNotLike(String value) {
            addCriterion("vuln_type not like", value, "vulnType");
            return (Criteria) this;
        }

        public Criteria andVulnTypeIn(List<String> values) {
            addCriterion("vuln_type in", values, "vulnType");
            return (Criteria) this;
        }

        public Criteria andVulnTypeNotIn(List<String> values) {
            addCriterion("vuln_type not in", values, "vulnType");
            return (Criteria) this;
        }

        public Criteria andVulnTypeBetween(String value1, String value2) {
            addCriterion("vuln_type between", value1, value2, "vulnType");
            return (Criteria) this;
        }

        public Criteria andVulnTypeNotBetween(String value1, String value2) {
            addCriterion("vuln_type not between", value1, value2, "vulnType");
            return (Criteria) this;
        }

        public Criteria andThrtypeIsNull() {
            addCriterion("thrtype is null");
            return (Criteria) this;
        }

        public Criteria andThrtypeIsNotNull() {
            addCriterion("thrtype is not null");
            return (Criteria) this;
        }

        public Criteria andThrtypeEqualTo(String value) {
            addCriterion("thrtype =", value, "thrtype");
            return (Criteria) this;
        }

        public Criteria andThrtypeNotEqualTo(String value) {
            addCriterion("thrtype <>", value, "thrtype");
            return (Criteria) this;
        }

        public Criteria andThrtypeGreaterThan(String value) {
            addCriterion("thrtype >", value, "thrtype");
            return (Criteria) this;
        }

        public Criteria andThrtypeGreaterThanOrEqualTo(String value) {
            addCriterion("thrtype >=", value, "thrtype");
            return (Criteria) this;
        }

        public Criteria andThrtypeLessThan(String value) {
            addCriterion("thrtype <", value, "thrtype");
            return (Criteria) this;
        }

        public Criteria andThrtypeLessThanOrEqualTo(String value) {
            addCriterion("thrtype <=", value, "thrtype");
            return (Criteria) this;
        }

        public Criteria andThrtypeLike(String value) {
            addCriterion("thrtype like", value, "thrtype");
            return (Criteria) this;
        }

        public Criteria andThrtypeNotLike(String value) {
            addCriterion("thrtype not like", value, "thrtype");
            return (Criteria) this;
        }

        public Criteria andThrtypeIn(List<String> values) {
            addCriterion("thrtype in", values, "thrtype");
            return (Criteria) this;
        }

        public Criteria andThrtypeNotIn(List<String> values) {
            addCriterion("thrtype not in", values, "thrtype");
            return (Criteria) this;
        }

        public Criteria andThrtypeBetween(String value1, String value2) {
            addCriterion("thrtype between", value1, value2, "thrtype");
            return (Criteria) this;
        }

        public Criteria andThrtypeNotBetween(String value1, String value2) {
            addCriterion("thrtype not between", value1, value2, "thrtype");
            return (Criteria) this;
        }

        public Criteria andVulnExploitIsNull() {
            addCriterion("vuln_exploit is null");
            return (Criteria) this;
        }

        public Criteria andVulnExploitIsNotNull() {
            addCriterion("vuln_exploit is not null");
            return (Criteria) this;
        }

        public Criteria andVulnExploitEqualTo(String value) {
            addCriterion("vuln_exploit =", value, "vulnExploit");
            return (Criteria) this;
        }

        public Criteria andVulnExploitNotEqualTo(String value) {
            addCriterion("vuln_exploit <>", value, "vulnExploit");
            return (Criteria) this;
        }

        public Criteria andVulnExploitGreaterThan(String value) {
            addCriterion("vuln_exploit >", value, "vulnExploit");
            return (Criteria) this;
        }

        public Criteria andVulnExploitGreaterThanOrEqualTo(String value) {
            addCriterion("vuln_exploit >=", value, "vulnExploit");
            return (Criteria) this;
        }

        public Criteria andVulnExploitLessThan(String value) {
            addCriterion("vuln_exploit <", value, "vulnExploit");
            return (Criteria) this;
        }

        public Criteria andVulnExploitLessThanOrEqualTo(String value) {
            addCriterion("vuln_exploit <=", value, "vulnExploit");
            return (Criteria) this;
        }

        public Criteria andVulnExploitLike(String value) {
            addCriterion("vuln_exploit like", value, "vulnExploit");
            return (Criteria) this;
        }

        public Criteria andVulnExploitNotLike(String value) {
            addCriterion("vuln_exploit not like", value, "vulnExploit");
            return (Criteria) this;
        }

        public Criteria andVulnExploitIn(List<String> values) {
            addCriterion("vuln_exploit in", values, "vulnExploit");
            return (Criteria) this;
        }

        public Criteria andVulnExploitNotIn(List<String> values) {
            addCriterion("vuln_exploit not in", values, "vulnExploit");
            return (Criteria) this;
        }

        public Criteria andVulnExploitBetween(String value1, String value2) {
            addCriterion("vuln_exploit between", value1, value2, "vulnExploit");
            return (Criteria) this;
        }

        public Criteria andVulnExploitNotBetween(String value1, String value2) {
            addCriterion("vuln_exploit not between", value1, value2, "vulnExploit");
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

        public Criteria andOtherIdIsNull() {
            addCriterion("other_id is null");
            return (Criteria) this;
        }

        public Criteria andOtherIdIsNotNull() {
            addCriterion("other_id is not null");
            return (Criteria) this;
        }

        public Criteria andOtherIdEqualTo(String value) {
            addCriterion("other_id =", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdNotEqualTo(String value) {
            addCriterion("other_id <>", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdGreaterThan(String value) {
            addCriterion("other_id >", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdGreaterThanOrEqualTo(String value) {
            addCriterion("other_id >=", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdLessThan(String value) {
            addCriterion("other_id <", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdLessThanOrEqualTo(String value) {
            addCriterion("other_id <=", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdLike(String value) {
            addCriterion("other_id like", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdNotLike(String value) {
            addCriterion("other_id not like", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdIn(List<String> values) {
            addCriterion("other_id in", values, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdNotIn(List<String> values) {
            addCriterion("other_id not in", values, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdBetween(String value1, String value2) {
            addCriterion("other_id between", value1, value2, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdNotBetween(String value1, String value2) {
            addCriterion("other_id not between", value1, value2, "otherId");
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