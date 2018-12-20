package com.ctgu.bean;

import java.util.ArrayList;
import java.util.List;

public class ResoursesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    public ResoursesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
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

        public Criteria andRidIsNull() {
            addCriterion("RID is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("RID is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("RID =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("RID <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("RID >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RID >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("RID <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("RID <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("RID in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("RID not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("RID between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("RID not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRnameIsNull() {
            addCriterion("RName is null");
            return (Criteria) this;
        }

        public Criteria andRnameIsNotNull() {
            addCriterion("RName is not null");
            return (Criteria) this;
        }

        public Criteria andRnameEqualTo(String value) {
            addCriterion("RName =", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotEqualTo(String value) {
            addCriterion("RName <>", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThan(String value) {
            addCriterion("RName >", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThanOrEqualTo(String value) {
            addCriterion("RName >=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThan(String value) {
            addCriterion("RName <", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThanOrEqualTo(String value) {
            addCriterion("RName <=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLike(String value) {
            addCriterion("RName like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotLike(String value) {
            addCriterion("RName not like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameIn(List<String> values) {
            addCriterion("RName in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotIn(List<String> values) {
            addCriterion("RName not in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameBetween(String value1, String value2) {
            addCriterion("RName between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotBetween(String value1, String value2) {
            addCriterion("RName not between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRpathIsNull() {
            addCriterion("RPath is null");
            return (Criteria) this;
        }

        public Criteria andRpathIsNotNull() {
            addCriterion("RPath is not null");
            return (Criteria) this;
        }

        public Criteria andRpathEqualTo(String value) {
            addCriterion("RPath =", value, "rpath");
            return (Criteria) this;
        }

        public Criteria andRpathNotEqualTo(String value) {
            addCriterion("RPath <>", value, "rpath");
            return (Criteria) this;
        }

        public Criteria andRpathGreaterThan(String value) {
            addCriterion("RPath >", value, "rpath");
            return (Criteria) this;
        }

        public Criteria andRpathGreaterThanOrEqualTo(String value) {
            addCriterion("RPath >=", value, "rpath");
            return (Criteria) this;
        }

        public Criteria andRpathLessThan(String value) {
            addCriterion("RPath <", value, "rpath");
            return (Criteria) this;
        }

        public Criteria andRpathLessThanOrEqualTo(String value) {
            addCriterion("RPath <=", value, "rpath");
            return (Criteria) this;
        }

        public Criteria andRpathLike(String value) {
            addCriterion("RPath like", value, "rpath");
            return (Criteria) this;
        }

        public Criteria andRpathNotLike(String value) {
            addCriterion("RPath not like", value, "rpath");
            return (Criteria) this;
        }

        public Criteria andRpathIn(List<String> values) {
            addCriterion("RPath in", values, "rpath");
            return (Criteria) this;
        }

        public Criteria andRpathNotIn(List<String> values) {
            addCriterion("RPath not in", values, "rpath");
            return (Criteria) this;
        }

        public Criteria andRpathBetween(String value1, String value2) {
            addCriterion("RPath between", value1, value2, "rpath");
            return (Criteria) this;
        }

        public Criteria andRpathNotBetween(String value1, String value2) {
            addCriterion("RPath not between", value1, value2, "rpath");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNull() {
            addCriterion("RType is null");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNotNull() {
            addCriterion("RType is not null");
            return (Criteria) this;
        }

        public Criteria andRtypeEqualTo(String value) {
            addCriterion("RType =", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotEqualTo(String value) {
            addCriterion("RType <>", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThan(String value) {
            addCriterion("RType >", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThanOrEqualTo(String value) {
            addCriterion("RType >=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThan(String value) {
            addCriterion("RType <", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThanOrEqualTo(String value) {
            addCriterion("RType <=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLike(String value) {
            addCriterion("RType like", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotLike(String value) {
            addCriterion("RType not like", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeIn(List<String> values) {
            addCriterion("RType in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotIn(List<String> values) {
            addCriterion("RType not in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeBetween(String value1, String value2) {
            addCriterion("RType between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotBetween(String value1, String value2) {
            addCriterion("RType not between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andRstatusIsNull() {
            addCriterion("RStatus is null");
            return (Criteria) this;
        }

        public Criteria andRstatusIsNotNull() {
            addCriterion("RStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRstatusEqualTo(String value) {
            addCriterion("RStatus =", value, "rstatus");
            return (Criteria) this;
        }

        public Criteria andRstatusNotEqualTo(String value) {
            addCriterion("RStatus <>", value, "rstatus");
            return (Criteria) this;
        }

        public Criteria andRstatusGreaterThan(String value) {
            addCriterion("RStatus >", value, "rstatus");
            return (Criteria) this;
        }

        public Criteria andRstatusGreaterThanOrEqualTo(String value) {
            addCriterion("RStatus >=", value, "rstatus");
            return (Criteria) this;
        }

        public Criteria andRstatusLessThan(String value) {
            addCriterion("RStatus <", value, "rstatus");
            return (Criteria) this;
        }

        public Criteria andRstatusLessThanOrEqualTo(String value) {
            addCriterion("RStatus <=", value, "rstatus");
            return (Criteria) this;
        }

        public Criteria andRstatusLike(String value) {
            addCriterion("RStatus like", value, "rstatus");
            return (Criteria) this;
        }

        public Criteria andRstatusNotLike(String value) {
            addCriterion("RStatus not like", value, "rstatus");
            return (Criteria) this;
        }

        public Criteria andRstatusIn(List<String> values) {
            addCriterion("RStatus in", values, "rstatus");
            return (Criteria) this;
        }

        public Criteria andRstatusNotIn(List<String> values) {
            addCriterion("RStatus not in", values, "rstatus");
            return (Criteria) this;
        }

        public Criteria andRstatusBetween(String value1, String value2) {
            addCriterion("RStatus between", value1, value2, "rstatus");
            return (Criteria) this;
        }

        public Criteria andRstatusNotBetween(String value1, String value2) {
            addCriterion("RStatus not between", value1, value2, "rstatus");
            return (Criteria) this;
        }

        public Criteria andArticlesAidIsNull() {
            addCriterion("Articles_AID is null");
            return (Criteria) this;
        }

        public Criteria andArticlesAidIsNotNull() {
            addCriterion("Articles_AID is not null");
            return (Criteria) this;
        }

        public Criteria andArticlesAidEqualTo(Integer value) {
            addCriterion("Articles_AID =", value, "articlesAid");
            return (Criteria) this;
        }

        public Criteria andArticlesAidNotEqualTo(Integer value) {
            addCriterion("Articles_AID <>", value, "articlesAid");
            return (Criteria) this;
        }

        public Criteria andArticlesAidGreaterThan(Integer value) {
            addCriterion("Articles_AID >", value, "articlesAid");
            return (Criteria) this;
        }

        public Criteria andArticlesAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Articles_AID >=", value, "articlesAid");
            return (Criteria) this;
        }

        public Criteria andArticlesAidLessThan(Integer value) {
            addCriterion("Articles_AID <", value, "articlesAid");
            return (Criteria) this;
        }

        public Criteria andArticlesAidLessThanOrEqualTo(Integer value) {
            addCriterion("Articles_AID <=", value, "articlesAid");
            return (Criteria) this;
        }

        public Criteria andArticlesAidIn(List<Integer> values) {
            addCriterion("Articles_AID in", values, "articlesAid");
            return (Criteria) this;
        }

        public Criteria andArticlesAidNotIn(List<Integer> values) {
            addCriterion("Articles_AID not in", values, "articlesAid");
            return (Criteria) this;
        }

        public Criteria andArticlesAidBetween(Integer value1, Integer value2) {
            addCriterion("Articles_AID between", value1, value2, "articlesAid");
            return (Criteria) this;
        }

        public Criteria andArticlesAidNotBetween(Integer value1, Integer value2) {
            addCriterion("Articles_AID not between", value1, value2, "articlesAid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Resourses
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 20 04:55:17 PST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Resourses
     *
     * @mbg.generated Thu Dec 20 04:55:17 PST 2018
     */
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