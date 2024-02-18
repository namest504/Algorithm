SELECT
  event_date_kst AS dt,
  COUNT(DISTINCT (user_pseudo_id)) AS users
FROM
  ga
WHERE
  event_date_kst BETWEEN DATE('2021-08-02') AND DATE('2021-08-09')
GROUP BY
  event_date_kst
ORDER BY
  dt ASC