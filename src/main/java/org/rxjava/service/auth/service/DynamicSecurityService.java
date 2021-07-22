package org.rxjava.service.auth.service;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author happy
 */
@Service
public class DynamicSecurityService {
    public Map<String, ConfigAttribute> loadDataSource() {
        return null;
    }
}
