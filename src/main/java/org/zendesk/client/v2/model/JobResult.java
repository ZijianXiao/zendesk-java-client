/*package org.zendesk.client.v2.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * https://developer.zendesk.com/rest_api/docs/support/job_statuses#results
 *
 * <p>Result entries have various properties. There is no clear description thus let's use a generic
 * Map Only the "id" of the object in Zendesk (Always a Long) seems to be always present. We define
 * few others helpers.
 */
//public class JobResult extends HashMap<String, Object> implements Serializable {

  /** The account ID */
//  public static final String ACCOUNT_ID = "account_id";

  /** the action the job attempted */
//  public static final String ACTION = "action";

  /** The details about the error */
//  public static final String DETAILS = "details";

  /** The user email */
//  public static final String EMAIL = "email";

  /** An error code */
//  public static final String ERROR = "error";

  /** The user external ID */
//  public static final String EXTERNAL_ID = "external_id";

  /** the id of the resource created or updated */
//  public static final String ID = "id";

  /** the index number of the result */
//  public static final String INDEX = "index";

  /** the status of the action */
//  public static final String STATUS = "status";

  /** whether the action was successful or not */
//  public static final String SUCCESS = "success";

//  public Long getAccountId() {
//    return (Long) get(ACCOUNT_ID);
//  }

//  public String getAction() {
//    return (String) get(ACTION);
//  }

//  public String getDetails() {
//    return (String) get(DETAILS);
//  }

//  public String getEmail() {
//    return (String) get(EMAIL);
//  }

//  public String getError() {
//    return (String) get(ERROR);
//  }

//  public String getExternalId() {
//    return (String) get(EXTERNAL_ID);
//  }

//  public Long getId() {
//    return (Long) get(ID);
//  }
//
//  public Long getIndex() {
//    return (Long) get(INDEX);
//  }
//
//  public String getStatus() {
//    return (String) get(STATUS);
//  }
//
//  public Boolean getSuccess() {
//    return (Boolean) get(SUCCESS);
//  }
//}

//Refactor

package org.zendesk.client.v2.model;

import java.io.Serializable;
import java.util.HashMap;

public class JobResult extends HashMap<String, Object> implements Serializable {
  private static final String ID = "id";
  private static final String INDEX = "index";
  private static final String ERROR = "error";

  private Long id;
  private Long index;
  private String error;

  private AccountInformation accountInformation;
  private JobActionDetails jobActionDetails;
  private UserInformation userInformation;

  public JobResult(Long id, Long index, String error, AccountInformation accountInformation,
                   JobActionDetails jobActionDetails, UserInformation userInformation) {
    this.id = id;
    this.index = index;
    this.error = error;
    this.accountInformation = accountInformation;
    this.jobActionDetails = jobActionDetails;
    this.userInformation = userInformation;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getIndex() {
    return index;
  }

  public void setIndex(Long index) {
    this.index = index;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public AccountInformation getAccountInformation() {
    return accountInformation;
  }

  public void setAccountInformation(AccountInformation accountInformation) {
    this.accountInformation = accountInformation;
  }

  public JobActionDetails getJobActionDetails() {
    return jobActionDetails;
  }

  public void setJobActionDetails(JobActionDetails jobActionDetails) {
    this.jobActionDetails = jobActionDetails;
  }

  public UserInformation getUserInformation() {
    return userInformation;
  }

  public void setUserInformation(UserInformation userInformation) {
    this.userInformation = userInformation;
  }
}

//AccountInformation
class AccountInformation implements Serializable {
  private static final String ACCOUNT_ID = "account_id";

  private Long accountId;

  public AccountInformation(Long accountId) {
    this.accountId = accountId;
  }

  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }
}

//JobActionDetails
class JobActionDetails implements Serializable {
  private static final String ACTION = "action";
  private static final String DETAILS = "details";
  private static final String STATUS = "status";
  private static final String SUCCESS = "success";

  private String action;
  private String details;
  private String status;
  private Boolean success;

  public JobActionDetails(String action, String details, String status, Boolean success) {
    this.action = action;
    this.details = details;
    this.status = status;
    this.success = success;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }
}

//UserInformation
class UserInformation implements Serializable {
  private static final String EMAIL = "email";
  private static final String EXTERNAL_ID = "external_id";

  private String email;
  private String externalId;

  public UserInformation(String email, String externalId) {
    this.email = email;
    this.externalId = externalId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }
}

