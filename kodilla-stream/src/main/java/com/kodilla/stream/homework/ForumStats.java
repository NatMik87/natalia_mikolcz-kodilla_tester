package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double post = UserRepository.getUsersList()
                .stream()
                .map(u -> u.getNumberOfPost())
                .mapToInt(p -> p)
                .average()
                .getAsDouble();
        System.out.println(post);
    }
}
