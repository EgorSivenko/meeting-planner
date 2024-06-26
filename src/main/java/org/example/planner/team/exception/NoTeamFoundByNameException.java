package org.example.planner.team.exception;

public class NoTeamFoundByNameException extends RuntimeException {

    private static final String MESSAGE = "Team with name '%s' not found";

    public NoTeamFoundByNameException(String teamName) {
        super(String.format(MESSAGE, teamName));
    }
}
