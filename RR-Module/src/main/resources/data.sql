-- MySQL Script generated by MySQL Workbench
-- Thu Nov 16 18:02:58 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema ncJournalDb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ncJournalDb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ncJournalDb` DEFAULT CHARACTER SET utf8 ;
USE `ncJournalDb` ;

-- -----------------------------------------------------
-- Table `ncJournalDb`.`group`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ncJournalDb`.`group` (
  `id` INT NOT NULL,
  `group_number` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ncJournalDb`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ncJournalDb`.`user` (
  `id` INT NOT NULL,
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `fullname` VARCHAR(45) NOT NULL,
  `role` INT NOT NULL,
  `group_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_user_group_idx` (`group_id` ASC),
  CONSTRAINT `fk_user_group1`
    FOREIGN KEY (`group_id`)
    REFERENCES `ncJournalDb`.`group` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `ncJournalDb`.`subject`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ncJournalDb`.`subject` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ncJournalDb`.`semester`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ncJournalDb`.`semester` (
  `id` INT NOT NULL,
  `semester_number` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ncJournalDb`.`work_plan`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ncJournalDb`.`work_plan` (
  `id` INT NOT NULL,
  `subject_id` INT NOT NULL,
  `semester_id` INT NOT NULL,
  `tutor_id` INT NOT NULL,
  PRIMARY KEY (`id`, `subject_id`, `semester_id`),
  INDEX `fk_work_plan_subject_idx` (`subject_id` ASC),
  INDEX `fk_work_plan_semester_idx` (`semester_id` ASC),
  INDEX `fk_work_plan_tutor_idx` (`tutor_id` ASC),
  CONSTRAINT `fk_work_plan_subject1`
    FOREIGN KEY (`subject_id`)
    REFERENCES `ncJournalDb`.`subject` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_work_plan_semester1`
    FOREIGN KEY (`semester_id`)
    REFERENCES `ncJournalDb`.`semester` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_work_plan_user1`
    FOREIGN KEY (`tutor_id`)
    REFERENCES `ncJournalDb`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ncJournalDb`.`journal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ncJournalDb`.`journal` (
  `id` INT NOT NULL,
  `mark` INT NOT NULL,
  `is_exam` TINYINT(1) NOT NULL,
  `semester_id` INT NOT NULL,
  `subject_id` INT NOT NULL,
  `user_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_journal_semester_idx` (`semester_id` ASC),
  INDEX `fk_journal_subject_idx` (`subject_id` ASC),
  INDEX `fk_journal_user_idx` (`user_id` ASC),
  CONSTRAINT `fk_journal_semester1`
    FOREIGN KEY (`semester_id`)
    REFERENCES `ncJournalDb`.`semester` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_journal_subject1`
    FOREIGN KEY (`subject_id`)
    REFERENCES `ncJournalDb`.`subject` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_journal_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `ncJournalDb`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ncJournalDb`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ncJournalDb`.`role` (
  `id` INT NOT NULL,
  `role_name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ncJournalDb`.`work_plan_has_group`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ncJournalDb`.`work_plan_has_group` (
  `work_plan_id` INT NOT NULL,
  `group_id` INT NOT NULL,
  PRIMARY KEY (`work_plan_id`, `group_id`),
  INDEX `fk_work_plan_has_group_group1_idx` (`group_id` ASC),
  INDEX `fk_work_plan_has_group_work_plan1_idx` (`work_plan_id` ASC),
  CONSTRAINT `fk_work_plan_has_group_work_plan1`
    FOREIGN KEY (`work_plan_id`)
    REFERENCES `ncJournalDb`.`work_plan` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_work_plan_has_group_group1`
    FOREIGN KEY (`group_id`)
    REFERENCES `ncJournalDb`.`group` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ncJournalDb`.`table1`
-- -----------------------------------------------------

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

 INSERT INTO `group` VALUES (1, 1);
 INSERT INTO user VALUES (1, 'admin', 'admin' , 'Pasha', 1, 1);