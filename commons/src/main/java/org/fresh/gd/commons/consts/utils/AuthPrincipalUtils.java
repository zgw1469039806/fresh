package org.fresh.gd.commons.consts.utils;

import org.fresh.gd.commons.consts.pojo.dto.oauth.AuthSysOrganizationDTO;
import org.fresh.gd.commons.consts.pojo.dto.oauth.AuthSysRoleDTO;

import org.fresh.gd.commons.consts.pojo.dto.oauth.AuthSysUserDTO;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName AuthPrincipalUtils
 * @Author alan.wang   QQ:3103484396
 * @Description TODO
 */
public class AuthPrincipalUtils
{

    public static AuthSysOrganizationDTO parseOrg(Authentication authentication)
    {
        Map<String, Object> principalMap = getPrincipalMap((OAuth2Authentication) authentication);
        Map<String , Object> orgMap = (Map<String, Object>) principalMap.get("organization");
        String orgCode = (String) orgMap.get("orgCode");
        String orgName = (String) orgMap.get("orgName");
        AuthSysOrganizationDTO org = new AuthSysOrganizationDTO();
        org.setOrgCode(orgCode);
        org.setOrgName(orgName);
        return org;
    }
    public static AuthSysUserDTO parseUserinfo(Authentication authentication)
    {
        Map<String, Object> principalMap = getPrincipalMap((OAuth2Authentication) authentication);
        AuthSysUserDTO userDTO = new AuthSysUserDTO();
        userDTO.setId(Integer.parseInt(principalMap.get("id").toString()));
        userDTO.setUsername((String) principalMap.get("username"));
        userDTO.setId(userDTO.getId());
        userDTO.setOrganization(parseOrg(authentication));
        return userDTO;
    }

    public static List<AuthSysRoleDTO> parseRole(Authentication authentication)
    {
        Map<String, Object> principalMap = getPrincipalMap((OAuth2Authentication) authentication);
        List<AuthSysRoleDTO> roleDTOList = new ArrayList<>();
        List<Map<String , Object>> roleMapList = (List<Map<String, Object>>) principalMap.get("roles");

        for (Map<String , Object> roleMap : roleMapList)
        {
            String roleName = (String) roleMap.get("roleName");
            String roleCode = (String) roleMap.get("roleCode");

            AuthSysRoleDTO roleDTO = new AuthSysRoleDTO();
            roleDTO.setRoleName(roleName);
            roleDTO.setRoleCode(roleCode);
            roleDTOList.add(roleDTO);
        }
        return roleDTOList;
    }

    private static Map<String, Object> getPrincipalMap(OAuth2Authentication authentication) {
        OAuth2Authentication oAuth2Authentication = authentication;
        Map<String , Object> details = (Map<String, Object>) oAuth2Authentication.getUserAuthentication().getDetails();
        return (Map<String, Object>) details.get("principal");
    }
}
