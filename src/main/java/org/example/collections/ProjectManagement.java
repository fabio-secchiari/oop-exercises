package org.example.collections;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Getter
class Project{
    @Setter
    private String name;
    @Setter
    private LocalDate startDate;
    private LocalDate endDate;
    private final Set<Task> tasks;

    public Project(String name, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.startDate = startDate;
        setEndDate(endDate);
        tasks = new HashSet<>();
    }

    public void setEndDate(LocalDate endDate) {
        if(endDate.isAfter(startDate)) this.endDate = endDate;
    }

    public void addTask(Task task){
        tasks.add(task);
        task.setProject(this);
    }

    public void removeTask(Task task){
        tasks.remove(task);
        task.setProject(null);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Project project)) return false;
        return Objects.equals(getName(), project.getName()) && Objects.equals(getStartDate(), project.getStartDate()) && Objects.equals(getEndDate(), project.getEndDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStartDate(), getEndDate());
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", tasks=" + tasks +
                '}';
    }
}

@Getter
class Task{
    private final UUID uuid;
    @Setter
    private String description;
    @Setter
    private Integer hoursNeeded;
    private Project project;
    @Setter
    private Employee teamLeader;

    public Task(String description, Integer hoursNeeded) {
        this.description = description;
        this.hoursNeeded = hoursNeeded;
        uuid = UUID.randomUUID();
    }

    public void setProject(Project project){
        // tolgo questo task dal progetto vecchio se c'è
        if (Objects.nonNull(this.project) && (this.project.getTasks().contains(this))) {
            this.project.removeTask(this);
        }
        // metto il task nel progetto nuovo
        if (Objects.nonNull(project)) {
            project.getTasks().add(this);
        }
        this.project = project;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Task task)) return false;
        return Objects.equals(getUuid(), task.getUuid());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getUuid());
    }

    @Override
    public String toString() {
        return "Task{" +
                "uuid=" + uuid +
                ", description='" + description + '\'' +
                ", hoursNeeded=" + hoursNeeded +
                '}';
    }
}

@Setter
@Getter
class Employee{
    private String name;
    private String lastname;
    private String socialSecurityCode;

    public Employee(String name, String lastname, String socialSecurityCode) {
        this.name = name;
        this.lastname = lastname;
        this.socialSecurityCode = socialSecurityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(getName(), employee.getName()) && Objects.equals(getLastname(), employee.getLastname()) && Objects.equals(getSocialSecurityCode(), employee.getSocialSecurityCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastname(), getSocialSecurityCode());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", socialSecurityCode='" + socialSecurityCode + '\'' +
                '}';
    }
}