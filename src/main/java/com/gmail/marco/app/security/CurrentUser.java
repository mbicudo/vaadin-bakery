package com.gmail.marco.app.security;

import com.gmail.marco.backend.data.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}
