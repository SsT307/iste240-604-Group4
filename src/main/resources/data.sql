CREATE DATABASE IF NOT EXISTS iste240;

USE iste240;

DELETE FROM doctor;

INSERT INTO doctor (first_name, last_name, speciality, hospitalid) VALUES
    ('Fatma', 'Alsuwaidi', 'Dentistry', 1),
    ('Tania', 'Aziz', 'Pediatrics', 2),
    ('Shaikha', 'Alhajri', 'Cardiologist', 3),
    ('Fatma', 'Almadani', 'Dermatologist', 4),
    ('Maryam', 'Almazrouei', 'Neurology', 5),
    ('Aisha', 'Alnuaimi', 'Orthopedics', 6),
    ('Noora', 'Alkaabi', 'Ophthalmology', 7),
    ('Hessa', 'Alfalasi', 'Gynecology', 8),
    ('Latifa', 'Almansoori', 'Psychiatry', 9),
    ('Maha', 'Alhashimi', 'General Medicine', 10),
    ('Reem', 'Alshamsi', 'ENT', 11),
    ('Salama', 'Alali', 'Radiology', 12),
    ('Amna', 'Alsuwaidi', 'Endocrinology', 13),
    ('Dana', 'Alhammadi', 'Urology', 14),
    ('Sara', 'Alketbi', 'Emergency Medicine', 15);
