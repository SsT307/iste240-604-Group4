CREATE DATABASE IF NOT EXISTS iste240;
USE iste240;

DELETE FROM medical_record;
DELETE FROM hospital;

INSERT INTO hospital(name, owner) VALUES
        ('City Hospital', 'Government'),
        ('Dubai Medical Center', 'Private'),
        ('Al Zahra Hospital', 'Private'),
        ('Rashid Hospital', 'Government');

INSERT INTO medical_record (visit_date, visit_time, conditions, treatment_given, effective, emiratesid, hospitalid) VALUES
        ('2026-01-15', '09:00:00', 'Fever', 'Paracetamol', true, 784123456, 1),
        ('2026-02-10', '14:30:00', 'Back Pain', 'Physiotherapy', true, 784654321, 2),
        ('2026-03-05', '11:00:00', 'Flu', 'Rest and fluids', true, 784111222, 1),
        ('2026-04-01', '16:00:00', 'Diabetes checkup', 'Insulin adjustment', true, 784333444, 3);