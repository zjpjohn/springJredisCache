// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoFile.proto

package proto;

public interface RoleVoOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // required uint32 roleID = 1;
  /**
   * <code>required uint32 roleID = 1;</code>
   *
   * <pre>
   *角色ID
   * </pre>
   */
  boolean hasRoleID();
  /**
   * <code>required uint32 roleID = 1;</code>
   *
   * <pre>
   *角色ID
   * </pre>
   */
  int getRoleID();

  // optional string roleName = 2;
  /**
   * <code>optional string roleName = 2;</code>
   *
   * <pre>
   *角色名称
   * </pre>
   */
  boolean hasRoleName();
  /**
   * <code>optional string roleName = 2;</code>
   *
   * <pre>
   *角色名称
   * </pre>
   */
  java.lang.String getRoleName();
  /**
   * <code>optional string roleName = 2;</code>
   *
   * <pre>
   *角色名称
   * </pre>
   */
  com.google.protobuf.ByteString
      getRoleNameBytes();

  // optional uint32 roleSex = 3;
  /**
   * <code>optional uint32 roleSex = 3;</code>
   *
   * <pre>
   *角色性别
   * </pre>
   */
  boolean hasRoleSex();
  /**
   * <code>optional uint32 roleSex = 3;</code>
   *
   * <pre>
   *角色性别
   * </pre>
   */
  int getRoleSex();
}
