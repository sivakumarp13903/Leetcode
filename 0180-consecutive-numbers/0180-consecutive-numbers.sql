# Write your MySQL query statement below



select distinct num as ConsecutiveNums from(
select 
    num,
    lag(num,1) over (order by id) as prev1,
    lag(num,2) over (order by id) as prev2 from Logs) as Temp
where num = prev1 and num=prev2;