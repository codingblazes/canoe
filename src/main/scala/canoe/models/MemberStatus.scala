package canoe.models

object MemberStatus extends Enumeration {
  type MemberStatus = Value
  val Creator, Administrator, Member, Restricted, Left, Kicked = Value
}
