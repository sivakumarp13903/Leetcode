# Write your MySQL query statement below

with t2 as(
    (select 
    requester_id as id ,
     accepter_id
    from RequestAccepted)
    union all
    (select 
    accepter_id as id,
    requester_id
    
    from RequestAccepted)
)

select id , count(*) as num from t2
group by id
order by count(*) desc
limit 1;