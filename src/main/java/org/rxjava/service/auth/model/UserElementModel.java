package org.rxjava.service.auth.model;

import lombok.Data;

import java.util.List;

/**
 * @author happy
 */
@Data
public class UserElementModel {
    private String id;
    private String name;
    private String parentId;
    private String type;
    private String order;
    private String url;
    private Byte sceneFlag;
    private List<UserElementModel> childs;
}
