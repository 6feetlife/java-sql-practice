package com.jungmin.script;

public class Part2 {
  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-1. users 테이블에 존재하는 모든 컬럼을 포함한 모든 데이터를 확인하기 위한 SQL을 작성해주세요.
  */
  public static final String PART2_1 = "SELECT * FROM Users";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-2. users 테이블에 존재하는 모든 데이터에서 username 컬럼만을 확인하기 위한 SQL을 작성해주세요.
  */
  public static final String PART2_2 = "SELECT u.username FROM Users AS u";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-3. users 테이블에 데이터를 추가하기 위한 SQL을 작성해주세요.")
          - 원하는 username, email, password를 사용하시면 됩니다.
  */
  public static final String PART2_3 = "INSERT INTO Users(username, email, password) VALUES ('야옹', '야옹@야옹.야옹', '야옹야옹')";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-4. users 테이블에서 특정 조건을 가진 데이터를 찾기위한 SQL을 작성해주세요.
          - 조건 : username이 luckykim이여야 합니다.
  */
  public static final String PART2_4 = "SELECT u.username FROM Users AS u WHERE u.username = 'luckykim'";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-5. users 테이블에서 특정 조건을 가진 데이터를 찾기위한 SQL을 작성해주세요.
          - 조건 : username이 luckykim이 아니여야 합니다.
  */
  public static final String PART2_5 = "SELECT u.username FROM Users AS u WHERE u.username <> 'luckykim'";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-6. posts 테이블에 존재하는 모든 데이터에서 title 컬럼만을 찾기 위한 SQL을 작성해주세요.
  */

  public static final String PART2_6 = "SELECT p.title FROM Posts as p";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-7. posts의 title과 그 게시글을 작성한 user의 username을 찾기 위한 SQL을 작성해주세요.
          - 저자가 없더라도, posts의 title을 모두 찾아야합니다.
  */
  public static final String PART2_7 =
          "SELECT p.title, u.username FROM Posts AS p " +
          "LEFT JOIN Users AS u on p.user_id = u.user_id";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-8. posts의 title과 그 게시글을 작성한 user의 username을 찾기 위한 SQL을 작성해주세요.
          - 저자가 있는 posts의 title만 찾아야합니다.
  */
  public static final String PART2_8 =
          "SELECT p.title, u.username FROM Posts AS p " +
          "JOIN Users AS u on p.user_id = u.user_id";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-9. posts 테이블의 데이터를 수정하기 위한 SQL을 작성해주세요.
          - title이 'New Tech Trends'인 posts 데이터에서 content를 'Updated content'로 수정해야합니다.
  */
  public static final String PART2_9 =
          "UPDATE Posts SET content = 'Updated content' " +
          "WHERE Posts.title = 'New Tech Trends'";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-10. posts 테이블의 데이터를 추가하기 위한 SQL을 작성해주세요.
          - luckykim이 작성한 게시글을 추가해주세요. 제목과 본문은 자유입니다. (참고: luckykim의 아이디는 1입니다.)
  */
  public static final String PART2_10 =
          "INSERT INTO Posts(user_id, title, content) VALUES (1, 'dddd', 'dddddd')";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-11. 어느 board에도 속하지 않는 post의 모든 데이터를 찾기위한 SQL을 작성해주세요.")
  */
  public static final String PART2_11 =
          "SELECT p.* FROM Posts AS p " +
          "WHERE p.board_id IS NULL";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-12. users 테이블의 user_id가 1인 유저가 작성한 post의 title을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART2_12 =
          "SELECT p.title FROM Posts AS p " +
          "JOIN Users AS u on u.user_id = p.user_id " +
          "WHERE u.user_id = 1";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-13. users 테이블의 user_id가 1인 유저가 작성한 post의 board name을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART2_13 =
          "SELECT b.name FROM Boards AS b " +
          "JOIN Posts AS p ON b.board_id = p.board_id " +
          "JOIN Users AS u ON p.user_id = u.user_id " +
          "WHERE u.user_id = 1";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-14. board의 name이 'General Discussion'인 post의 title, content, created_at을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART2_14 =
          "SELECT p.title, p.content, p.created_at FROM Posts AS p " +
          "JOIN Boards AS b ON b.board_id = p.board_id " +
          "WHERE b.name = 'General Discussion'";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-15. luckykim이 작성한 comment의 개수 (컬럼명: CommentCount)를 출력하기 위한 SQL을 작성해주세요.
  */
  public static final String PART2_15 =
          "SELECT COUNT(c.comment_id) AS CommentCount FROM Users AS u " +
          "JOIN Comments AS c ON u.user_id = c.user_id " +
          "WHERE u.username = 'luckykim'";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-16. 각 user(컬럼명: username)가 작성한 comment의 개수 (컬럼명: CommentCount)를 출력하기 위한 SQL을 작성해주세요.
          - 단, 0개의 comment를 작성한 유저도 모두 출력해야 합니다.
  */
  public static final String PART2_16 =
          "SELECT u.username, COUNT(c.comment_id) AS CommentCount FROM Users AS u " +
          "LEFT JOIN Comments AS c ON u.user_id = c.user_id " +
          "GROUP BY u.username";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-17. 각 board의 name과 해당 board에 속한 post의 개수 (컬럼명: PostCount)를 출력하기 위한 SQL을 작성해주세요.
  */
  public static final String PART2_17 =
          "SELECT b.name, COUNT(p.post_id) AS PostCount FROM " +
          "Boards AS b LEFT JOIN Posts AS p on b.board_id = p.board_id " +
          "GROUP BY b.name";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-18. 각 board의 name과 해당 board에 속한 posts 테이블의 content의 평균 길이 (컬럼명: AvgLength)를 출력하기 위한 SQL을 작성해주세요.")
  */
  public static final String PART2_18 =
          "SELECT b.name, AVG(LENGTH(p.content)) AS AvgLength FROM " +
          "Boards AS b LEFT JOIN Posts AS p on b.board_id = p.board_id " +
          "GROUP BY b.name";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-19. 각 board의 name과 해당 board에 속한 posts 테이블의 content의 평균 길이 (컬럼명: AvgLength)를 출력하기 위한 SQL을 작성해주세요.
          - 단, content가 null인 경우를 제외해야 합니다.
  */
  public static final String PART2_19 =
          "SELECT b.name, AVG(LENGTH(p.content)) AS AvgLength " +
          "FROM Boards AS b " +
          "LEFT JOIN Posts AS p ON b.board_id = p.board_id " +
          "WHERE p.content IS <> NULL " +
          "GROUP BY b.name";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-20. 각 tag의 name과 해당 tag가 달린 post의 개수 (컬럼명: PostCount)를 출력하기 위한 SQL을 작성해주세요.
          - 단, post에 할당되지 않은 tag의 이름도 모두 출력해야 합니다.")
  */
  public static final String PART2_20 =
          "SELECT t.name, COUNT(pt.post_id) AS PostCount FROM Tags AS t " +
          "LEFT JOIN Post_Tags AS pt ON t.tag_id = pt.tag_id " +
          "LEFT JOIN Posts AS p ON pt.post_id = p.post_id " +
          "GROUP BY t.name";
}
