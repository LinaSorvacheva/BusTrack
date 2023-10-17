package ru.aptech.bustrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.aptech.bustrack.Entities.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository <User, UUID>{

}
