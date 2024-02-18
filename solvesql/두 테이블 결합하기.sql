SELECT
  r.athlete_id
FROM
  records AS r
  JOIN events AS e ON e.id = r.event_id
WHERE
  e.sport = 'Golf'
GROUP BY
  r.athlete_id;