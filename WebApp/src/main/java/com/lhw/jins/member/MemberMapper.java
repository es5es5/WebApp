package com.lhw.jins.member;

public interface MemberMapper {
	public abstract int join(Member m);
	public abstract Member getMemberByEmail(Member m);
}
