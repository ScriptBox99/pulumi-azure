// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LogicApps.Outputs
{

    [OutputType]
    public sealed class IntegrationAccountBatchConfigurationReleaseCriteriaRecurrence
    {
        /// <summary>
        /// The end time of the schedule, formatted as an RFC3339 string.
        /// </summary>
        public readonly string? EndTime;
        /// <summary>
        /// The frequency of the schedule. Possible values are `Day`, `Hour`, `Minute`, `Month`, `Second`, `Week` and `Year`.
        /// </summary>
        public readonly string Frequency;
        /// <summary>
        /// The number of `frequency`s between runs.
        /// </summary>
        public readonly int Interval;
        /// <summary>
        /// A `schedule` block as documented below.
        /// </summary>
        public readonly Outputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceSchedule? Schedule;
        /// <summary>
        /// The start time of the schedule, formatted as an RFC3339 string.
        /// </summary>
        public readonly string? StartTime;
        /// <summary>
        /// The timezone of the start/end time.
        /// </summary>
        public readonly string? TimeZone;

        [OutputConstructor]
        private IntegrationAccountBatchConfigurationReleaseCriteriaRecurrence(
            string? endTime,

            string frequency,

            int interval,

            Outputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceSchedule? schedule,

            string? startTime,

            string? timeZone)
        {
            EndTime = endTime;
            Frequency = frequency;
            Interval = interval;
            Schedule = schedule;
            StartTime = startTime;
            TimeZone = timeZone;
        }
    }
}