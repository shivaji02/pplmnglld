package org.pplmnglld.models;

/**
 * Represents a User in the system with a unique ID, name, email, and role.
 */
public class User {
    private static long idCounter = 1; // Auto-incrementing ID
    private long id;                  // Unique user ID
    private String name;              // User name
    private String email;             // User email
    private Role role;                // User role (e.g., STUDENT, TEACHER, ADMIN)

    // Constructor that auto-generates the ID
    public User(Long aLong, String name, String email, Role role) {
        this.id = idCounter ++;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return " User [ID: " + id + ", Name: " + name + ", Email: " + email + ", Role: " + role +" ]";
    }
}
