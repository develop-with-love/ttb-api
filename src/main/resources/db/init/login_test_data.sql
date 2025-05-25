-- 부서 데이터 생성
INSERT INTO department (name, sort_order, depth) VALUES
                                                     ('개발팀', 1, 1),
                                                     ('인사팀', 2, 1),
                                                     ('영업팀', 3, 1);

-- 직책 데이터 생성
INSERT INTO duty (name, sort_order) VALUES
                                        ('팀장', 1),
                                        ('팀원', 2);

-- 직급 데이터 생성
INSERT INTO position (name, sort_order) VALUES
                                            ('부장', 1),
                                            ('과장', 2),
                                            ('대리', 3),
                                            ('사원', 4);

-- 직원 데이터 생성 (비밀번호는 BCrypt로 암호화된 'password123'을 사용)
INSERT INTO employees (id, email, password, name, phone_number, extension_number, is_leader, role, department_seq, duty_seq, position_seq)
VALUES
(1, 'admin@ttb.com', '111', '관리자', '010-1234-5678', '1234', true, 'ADMIN', 1, 1, 1),
(2, 'user1@ttb.com', '111', '홍길동', '010-2345-6789', '1235', false, 'USER', 1, 2, 3),
(3, 'user2@ttb.com', '111', '김철수', '010-3456-7890', '1236', false, 'USER', 2, 2, 4);
