package com.hcmiuiot.MicroSec.repositories;

import com.hcmiuiot.MicroSec.models.User;

public interface UserCommandRepository {
    User saveUser(User user);
    String testFunction();
}
